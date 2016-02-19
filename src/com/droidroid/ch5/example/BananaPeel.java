package com.droidroid.ch5.example;

/**
 * Created by robotpoi on 2016/2/19.
 */
class Banana{
    void peel(int i){}
}
public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(), b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}
