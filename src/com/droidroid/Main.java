package com.droidroid;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int b1 = 0xaa; // 0b10101010
        int b2 = 0x55; // 0b01010101
        int c1 = 0b10101010;
        int c2 = 0b01010101;
        System.out.println(Integer.toBinaryString(b1&b2));
        System.out.println(Integer.toBinaryString(c1 | c2));
        System.out.println(Integer.toBinaryString(c1 ^ c2));
        short d = (short) 0xa7;
        System.out.println(d + "==================="+Integer.toBinaryString(d)+"=========================");
        while(!Integer.toBinaryString(d).equals("0")){
            d>>=1;
            System.out.println(d+"===="+ Integer.toBinaryString(d));
        }
    }
}
