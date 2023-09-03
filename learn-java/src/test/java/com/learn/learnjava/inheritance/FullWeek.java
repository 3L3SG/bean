package com.learn.learnjava.inheritance;

import java.time.LocalDate;

public enum FullWeek implements Vehicle,Cloneable {
    SATURDAY("SATURDAY"), SUNDAY("SUNDAY");
    private String value;

    FullWeek(String value) {
        this.value = value;
    }

    @Override
    public LocalDate getRegistrationDate() {
        return null;
    }
}
