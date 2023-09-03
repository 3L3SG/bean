package com.learn.learnjava.model;

public class SavingAccount extends Account {

    private String branch;
    public SavingAccount(String accountNumber) {
        super(accountNumber);
    }
    @Override
    public String getAccountBalance() {
        return "1000";
    }

    public String getBranch() {
        return branch;
    }

    public SavingAccount setBranch(String branch) {
        this.branch = branch;
        return this;
    }
}
