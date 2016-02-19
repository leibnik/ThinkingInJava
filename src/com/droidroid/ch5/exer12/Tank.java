package com.droidroid.ch5.exer12;

/**
 * Created by robotpoi on 2016/2/20.
 */
public class Tank {
    boolean isFull = false;
    public Tank(boolean isFull){
        this.isFull = isFull;
    }
    void clear(){
        isFull = false;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (isFull){
            System.out.println("Error: is still full");
        }
    }

    public static void main(String[] args) {
        Tank tank =new Tank(true);
        tank.clear();
        new Tank(true);
        System.gc();
    }
}
