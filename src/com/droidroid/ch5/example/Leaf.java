package com.droidroid.ch5.example;

/**
 * Created by robotpoi on 2016/2/19.
 * this��ʾ���÷������Ǹ���������ã�this�ؼ���ֻ����ʵ�������͹�������ʹ��
 *
 * ������������increment()ͨ��this�ؼ��ַ��ضԵ�ǰ��������ã�
 * ���Ժ�������һ������ж�ͬһ����ִ�ж�β���
 */
public class Leaf {
    int i = 0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
