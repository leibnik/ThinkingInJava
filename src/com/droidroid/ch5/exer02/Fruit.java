package com.droidroid.ch5.exer02;

/**
 * Created by robotpoi on 2016/2/19.
 * ����һ���࣬������һ���ڶ����Ǿͱ���ʼ���˵�String���Լ���һ��ͨ����������ʼ����String�������ַ�ʽ�кβ��죿
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
