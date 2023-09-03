package com.learn.learnjava.threads;

public class TestThreads {



    public static void main(String[] args){
        ThreadEx1 r1 = new ThreadEx1();
        ThreadEx2 r2 = new ThreadEx2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}