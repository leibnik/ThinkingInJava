package com.droidroid.utils;

import java.io.PrintStream;

/**
 * Created by leibnik on 16-9-1.
 */
public class Print {
    public static void print(Object obj){
        System.out.println(obj);
    }

    public static void print(){
        System.out.println();
    }

    public static void printnb(Object obj){
        System.out.print(obj);
    }

    public static PrintStream printf(String format, Object... args){
        return System.out.printf(format,args);
    }
}
