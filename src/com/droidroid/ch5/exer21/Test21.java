package com.droidroid.ch5.exer21;

import java.util.Arrays;

/**
 * Created by Droidroid on 2016/8/28.
 */

enum Money {
    FEN, JIAO, YUAN, BAI
}

public class Test21 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Money.values()));
        for (Money kk : Money.values()) {
            System.out.println(kk.ordinal());
            switch (kk) {
                case FEN:
                    System.out.println("分");
                    break;
                case YUAN:
                    System.out.println("元");
                    break;
                case BAI:
                    System.out.println("百");
                    break;
                case JIAO:
                    System.out.println("角");
                    break;
            }
        }
    }
}
