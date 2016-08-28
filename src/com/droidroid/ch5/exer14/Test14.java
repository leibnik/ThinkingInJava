package com.droidroid.ch5.exer14;

/**
 * Created by Droidroid on 2016/8/28.
 */
public class Test14 {
    static String s1 = "hello";
    static String s2;
    static {
        s2 = "world";
    }
    public static void printString(String s){
        System.out.print(s);
    }
    public static void main(String[] args){
        printString(Test14.s1);
    }
}
