package com.droidroid.ch5.exer06;

/**
 * Created by robotpoi on 2016/2/19.
 */
public class Dog {
    void barking(char x, String s) {
        System.out.println("barking... " + x + " times(char)");
    }

    void barking(byte x, String s) {
        System.out.println("barking... " + x + " times(byte)");
    }

    void barking(short x, String s) {
        System.out.println("barking... " + x + " times(short)");
    }

    void barking(int x, String s) {
        System.out.println("barking... " + x + " times(int)");
    }

    void barking(long x, String s) {
        System.out.println("barking... " + x + " times(long)");
    }

    void barking(float x, String s) {
        System.out.println("barking... " + x + " times(float)");
    }

    void barking(double x, String s) {
        System.out.println("barking... " + x + " times(double)");
    }


    void barking(String s, char x) {
        System.out.println("barking... " + x + " times(char)");
    }

    void barking(String s, byte x) {
        System.out.println("barking... " + x + " times(byte)");
    }

    void barking(String s, short x) {
        System.out.println("barking... " + x + " times(short)");
    }

    void barking(String s, int x) {
        System.out.println("barking... " + x + " times(int)");
    }

    void barking(String s, long x) {
        System.out.println("barking... " + x + " times(long)");
    }

    void barking(String s, float x) {
        System.out.println("barking... " + x + " times(float)");
    }

    void barking(String s, double x) {
        System.out.println("barking... " + x + " times(double)");
    }


    void howling(char x, String s) {
        System.out.println("howling... " + x + " times(char)");
    }

    void howling(byte x, String s) {
        System.out.println("howling... " + x + " times(byte)");
    }

    void howling(short x, String s) {
        System.out.println("howling... " + x + " times(short)");
    }

    void howling(int x, String s) {
        System.out.println("howling... " + x + " times(int)");
    }

    void howling(long x, String s) {
        System.out.println("howling... " + x + " times(long)");
    }

    void howling(float x, String s) {
        System.out.println("howling... " + x + " times(float)");
    }

    void howling(double x, String s) {
        System.out.println("howling... " + x + " times(double)");
    }


    void howling(String s, char x) {
        System.out.println("howling... " + x + " times(char)");
    }

    void howling(String s, byte x) {
        System.out.println("howling... " + x + " times(byte)");
    }

    void howling(String s, short x) {
        System.out.println("howling... " + x + " times(short)");
    }

    void howling(String s, int x) {
        System.out.println("howling... " + x + " times(int)");
    }

    void howling(String s, long x) {
        System.out.println("howling... " + x + " times(long)");
    }

    void howling(String s, float x) {
        System.out.println("howling... " + x + " times(float)");
    }

    void howling(String s, double x) {
        System.out.println("howling... " + x + " times(double)");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.barking(34, "dog");
        dog.barking("dog", 34);
        dog.howling('c', "dog");
        dog.howling("dog", 'c' + 1);
    }
}
