package com.droidroid.ch5.example;

import java.util.Arrays;

/**
 * Created by Droidroid on 2016/8/28.
 */

enum Spiciness{
    NOT, MILD, MEDIUN, HOT, FLAMING
}

public class EnumOrder {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.HOT;
        System.out.println(howHot);

        System.out.println(Arrays.toString(Spiciness.values()));

        for (Spiciness s: Spiciness.values()){
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
