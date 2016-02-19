package com.droidroid.ch5.exer05;

/**
 * Created by robotpoi on 2016/2/19.
 */
public class Dog {
    void barking(char x){
        System.out.println("barking... " + x + " times(char)");
    }
    void barking(byte x){
        System.out.println("barking... " + x + " times(byte)");
    }
    void barking(short x){
        System.out.println("barking... " + x + " times(short)");
    }
    void barking(int x){
        System.out.println("barking... " + x + " times(int)");
    }
    void barking(long x){
        System.out.println("barking... " + x + " times(long)");
    }
    void barking(float x){
        System.out.println("barking... " + x + " times(float)");
    }
    void barking(double x){
        System.out.println("barking... " + x + " times(double)");
    }



    void howling(char x){
        System.out.println("howling... " + x + " times(char)");
    }
    void howling(byte x){
        System.out.println("howling... " + x + " times(byte)");
    }
    void howling(short x){
        System.out.println("howling... " + x + " times(short)");
    }
    void howling(int x){
        System.out.println("howling... " + x + " times(int)");
    }
    void howling(long x){
        System.out.println("howling... " + x + " times(long)");
    }
    void howling(float x){
        System.out.println("howling... " + x + " times(float)");
    }
    void howling(double x){
        System.out.println("howling... " + x + " times(double)");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.barking(34);
        dog.barking(222);
        dog.howling('c');
        dog.howling('c' + 1);
    }
}
