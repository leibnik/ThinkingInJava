package com.droidroid.ch5.example;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Droidroid on 2016/8/28.
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        System.out.println("length of a = " + a.length);
        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt(500);
        }
        System.out.println(Arrays.toString(a));
    }
}
