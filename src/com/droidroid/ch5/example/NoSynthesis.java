package com.droidroid.ch5.example;

/**
 * Created by robotpoi on 2016/2/19.
 * 如果自己已经明确定义了构造器，编译器就不会再帮我们定义默认的构造器
 * 必须自己手动添加，如
 * Bird2(){
 *
 * }
 */
class Bird2{
    Bird2(int i){}
    Bird2(double d){}
}
public class NoSynthesis {
    public static void main(String[] args) {
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
//        new Bird2();
    }
}
