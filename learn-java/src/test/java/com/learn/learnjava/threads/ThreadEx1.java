package com.learn.learnjava.threads;

public class ThreadEx1 implements Runnable{
    @Override
    public void run() {
        System.out.println("ThreadEx1 is started");
        Thread.yield();
        Thread.yield();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ThreadEx1 is finished");
    }
}
