package com.droidroid.ch5.example;

/**
 * Created by robotpoi on 2016/2/19.
 * ����Լ��Ѿ���ȷ�����˹��������������Ͳ����ٰ����Ƕ���Ĭ�ϵĹ�����
 * �����Լ��ֶ���ӣ���
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
