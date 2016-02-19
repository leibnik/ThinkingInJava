package com.droidroid.ch5.example;

/**
 * Created by robotpoi on 2016/2/19.
 * this表示调用方法的那个对象的引用，this关键字只能在实例方法和构造器中使用
 *
 * 在例子中由于increment()通过this关键字返回对当前对象的引用，
 * 所以很容易在一个语句中对同一对象执行多次操作
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
