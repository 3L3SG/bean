package com.learn.learnjava.model;

import java.io.Closeable;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentAccount extends Account implements Cloneable {

    public static String getClassName() {
        return CurrentAccount.class.getName();
    }

    private String accountName = "currentAccount";
    public String accountNumber = "CA1234";

    private String location;

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    public String getLocation() {
        return location;
    }

    public CurrentAccount setLocation(String location) {
        this.location = location;
        return this;
    }

    @Override
    public String getAccountName() {
        return accountName;
    }

    @Override
    public CurrentAccount setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public CurrentAccount setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    @Override
    public String getAccountBalance() {
        return "800";
    }

    @Override
    public void printLocation(String location) {
        System.out.println("location is " + location);
    }

    @Override
    public LocalDate getLocalDate(String date) throws DateTimeException {
        return LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
    }

    @Override
    public LocalDateTime getLocalDateTime(String date) throws DateTimeException {
        return LocalDateTime.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
    }

    @Override
    public LocalDate getLocalTime(String date) throws IOException {
        return LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
    }


    @Override
    public CurrentAccount clone() {
        try {
            CurrentAccount clone = (CurrentAccount) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
