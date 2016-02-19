package com.droidroid.ch5.exer02;

/**
 * Created by robotpoi on 2016/2/19.
 */
public class Vegetable {
    private Fruit fruit = new Fruit();
    public Vegetable(){
        System.out.println("vegetable");
    }

    public static void main(String[] args) {
        new Vegetable();
    }
}
