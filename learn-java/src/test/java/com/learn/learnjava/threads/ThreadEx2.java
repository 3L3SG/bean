package com.learn.learnjava.threads;

public class ThreadEx2 implements Runnable {
    @Override
    public void run() {
        System.out.println("ThreadEx2 is started");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ThreadEx2 is finished");
    }
}
