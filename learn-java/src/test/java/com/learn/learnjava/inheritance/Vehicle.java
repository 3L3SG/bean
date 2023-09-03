package com.learn.learnjava.inheritance;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public interface Vehicle {
    String name = "The Ancient";

    LocalDate getRegistrationDate();

    default String getName() {
        System.out.println("default method getName");
        return name;
    }

    default String getModel() {
        System.out.println("default method getModel");
        return "XUV";
    }

    private void doSomething() {
        System.out.println("private method doing nothing");
    }

    static String getState() {
        List<String> states = List.of("Prototype", "New", "Old", "Junk");
        int a = (int) (Math.random() * 10) % 4;
//        System.out.println("random generated index is " + a);
        return states.get(a);
    }


}
