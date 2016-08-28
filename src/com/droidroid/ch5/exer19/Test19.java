package com.droidroid.ch5.exer19;

/**
 * Created by Droidroid on 2016/8/28.
 */
public class Test19 {
    static void printArray(String... args) {
        for (String str : args)
            System.out.print(str + " ");
    }

    public static void main(String[] args) {
        printArray("jjj", "fdfds", "jjfhds");
        System.out.println();
        printArray(new String[]{"mmmm", "9999", "3333"});
    }
}
