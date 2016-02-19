package com.droidroid.ch5.exer09;

/**
 * Created by robotpoi on 2016/2/19.
 */
public class Money {
    public Money(){
        this(11);
    }
    public Money(int money){
        System.out.println("only " + money + " гд");
    }

    public static void main(String[] args) {
        new Money();
    }
}
