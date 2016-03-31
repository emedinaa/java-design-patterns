package com.emedinaa.patterns;


/**
 * Created by emedinaa on 30/03/16.
 */
public class Singleton {

    private static Singleton mInstance;

    public Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (mInstance == null) {
            mInstance = new Singleton();
        }
        return mInstance;
    }

}
