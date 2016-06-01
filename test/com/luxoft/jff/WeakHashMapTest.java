package com.luxoft.jff;

import java.util.Map;
import java.util.WeakHashMap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idavydov on 01.06.2016.
 */
public class WeakHashMapTest {

    /**
     * В WeakHashMap вместо ключей хранится слабая ссылка на ключ
     * как только все остальные ссылки на данный объект перестанут существовать объект может быть собран gc
     */
    @Test
    public void test() {
        final Map map = new WeakHashMap<>();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        map.put(obj1, "test");
        map.put(obj2, "test2");
        map.put(obj3, "test3");
        // Проверяем размер мапы
        Assert.assertEquals(3, map.size());
        // Затираем ссылки на ключи
        obj1 = null;
        obj2 = null;
        obj3 = null;
        // Мусорим что бы пришел сборщик
        for(int i=0; i<1000; i++) {
            byte b[] = new byte[1000000];
            b = null;
        }
        // Вызов сборщика
        System.gc();
        // Проверяем ещё раз размер мапы
        Assert.assertEquals(0, map.size());
    }
}
