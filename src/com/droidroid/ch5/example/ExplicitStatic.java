package com.droidroid.ch5.example;

/**
 * Created by robotpoi on 2016/2/20.
 * 1.被调用类的初始化工作完成后接着才是调用类进行初始化工作
 */
class Cc {
    public Cc(int i) {
        System.out.println("Cc(" + i + ")");
    }
}

class Cup {
    Cc c1 = new Cc(1000);
    static Cc c2 = new Cc(10);

    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup2;
    static Cup cup1;

    static {
        cup2 = new Cup(2);
        cup1 = new Cup(1);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }

    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}
