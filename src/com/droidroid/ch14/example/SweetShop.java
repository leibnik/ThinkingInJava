package com.droidroid.ch14.example;

import static com.droidroid.utils.Print.print;

/**
 * Created by leibnik on 16-11-4.
 */

class Candy{
    static { print("Loading Candy");}
}

class Gum{
    static { print("Loading Gum");}
}
class Cookie{
    static { print("Loading Cookie");}
}

public class SweetShop {
    public static void main(String[] args) {
        print("inside main");
        new Candy();
        print("After creating Candy");
        try{
            Class.forName("com.droidroid.ch14.example.Gum");
        } catch (ClassNotFoundException e) {
            print("Couldn't find Gum");
        }
        print("After Class.forName(\"Gum\")");
        new Cookie();
        print("After creating Cookie");
    }
}
