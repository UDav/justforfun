package com.luxoft.jff;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idavydov on 30.05.2016.
 */
public class SingletonTest {
    @Test
    public void oneObject() {
        final Singleton s1 = Singleton.getInstance();
        final Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        Assert.assertEquals(s1, s2);
    }

    @Test
    public void twoDifferentObjects() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        final Singleton s1 = Singleton.getInstance();

        final Constructor<?> constructor = Singleton.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        final Singleton s2 = (Singleton) constructor.newInstance();
        System.out.println(s1);
        System.out.println(s2);
        Assert.assertNotEquals(s1, s2);
    }
}
