package com.droidroid.ch5.exer02;

/**
 * Created by robotpoi on 2016/2/19.
 * 创建一个类，它包含一个在定义是就被初始化了的String域。以及另一个通过构造器初始化的String域。这两种方式有何差异？
 */
public class Fruit {
    private String variety = "fruit1";
    private String name;
    public Fruit(){
        System.out.println(variety +" "+name);
        name = "fruit2";
        System.out.println(variety + " " + name);
    }

    public static void main(String[] args) {
        new Fruit();
    }
}
