package com.droidroid.ch5.example;

/**
 * Created by robotpoi on 2016/2/19.
 * ÿ�����صķ�����������һ����һ�޶��Ĳ��������б��������͵�˳��ͬҲ�������ֿ�
 */
public class OverloadingOrder {
    static void f(String s, int i){
        System.out.println("String: " + s +", int: " + i);
    }
    static void f(int i, String s){
        System.out.println("int: " + i +", String: " + s);
    }

    public static void main(String[] args) {
        f("String first",11);
        f(99, "Int first");
    }
}
