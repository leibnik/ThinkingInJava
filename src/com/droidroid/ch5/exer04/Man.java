package com.droidroid.ch5.exer04;

/**
 * Created by robotpoi on 2016/2/19.
 */
public class Man {
    private String name;
    public Man(){
        System.out.println("I'm man");
    }
    public Man(String name){
        name = name;
        System.out.println("My name:" +name);
    }

    public static void main(String[] args) {
        new Man();
        new Man("Leibnik");
    }
}
