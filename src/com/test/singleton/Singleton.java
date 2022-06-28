package com.test.singleton;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
