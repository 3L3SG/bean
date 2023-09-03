package com.learn.learnjava.model;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public abstract class Account {
    public String accountNumber="AC1234";
    private String accountName = "DefaultAccount";

    public static String getClassName() {
        return Account.class.getName();
    }

    public Account() {
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public Account setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * child/subclass has to implement this method for inheritance
     */
    public abstract String getAccountBalance();

    /**
     * access specifier for overriding, child cannot make access specifier more restrictive
     */
    public void printLocation(String location) {
        System.out.println(location);
    }

    public LocalDate getLocalDate(String date) throws DateTimeParseException {
        return LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
    }

    public LocalDateTime getLocalDateTime(String date) {
        return LocalDateTime.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
    }

    public LocalDate getLocalTime(String date) throws IOException {
        return LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
    }

    public Account setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
