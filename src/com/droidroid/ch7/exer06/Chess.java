package com.droidroid.ch7.exer06;

/**
 * Created by robotpoi on 2016/2/19.
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess Constuctor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
