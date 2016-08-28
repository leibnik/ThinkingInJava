package com.droidroid.ch5.exer17;

import java.util.Arrays;

/**
 * Created by Droidroid on 2016/8/28.
 */
public class Test17 {
    public Test17(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test17[] array = new Test17[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Test17("" + i);
        }
    }
}
