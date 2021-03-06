package com.luxoft.jff;

/**
 * Created by idavydov on 30.05.2016.
 */
public class Singleton {
    private final static Singleton INSTANCE = new Singleton();

    private Singleton () {
        if (INSTANCE != null) {
            throw new IllegalConstructException();
        }
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
