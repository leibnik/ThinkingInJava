package com.droidroid.ch5.example;

/**
 * Created by robotpoi on 2016/2/19.
 */
class Rock{
    Rock(){
        System.out.print("Rock ");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
