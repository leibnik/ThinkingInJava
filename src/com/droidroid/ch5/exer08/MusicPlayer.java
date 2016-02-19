package com.droidroid.ch5.exer08;

/**
 * Created by robotpoi on 2016/2/19.
 */
public class MusicPlayer {


    void start(){
        System.out.println("started");
        play();
        this.play();
    }
    void play(){
        System.out.println("now playing...");
    }

    public static void main(String[] args) {
        new MusicPlayer().start();
    }
}
