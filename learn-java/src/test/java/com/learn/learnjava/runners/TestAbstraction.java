package com.learn.learnjava.runners;

import com.learn.learnjava.model.Account;
import com.learn.learnjava.model.CurrentAccount;
import com.learn.learnjava.model.MyAnnotation;
import com.learn.learnjava.model.SavingAccount;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class TestAbstraction {

    private static final Logger logger = LogManager.getLogger(TestAbstraction.class);

    Account account = new Account("1234") {
        @Override
        public String getAccountBalance() {
            return "1200";
        }
    };


    SavingAccount savingAccount = new SavingAccount("5678");

    @Test
    void testTheTest() {
        account.setAccountName("Test-Account");
        logger.info("{} has {} as balance", account.getAccountName(), account.getAccountBalance());

        savingAccount.setAccountName("Saving-Account");
        logger.info("{} has {} as balance", savingAccount.getAccountName(), savingAccount.getAccountBalance());
        logger.info("{} has {} as balance", account.getAccountName(), account.getAccountBalance());

    }

    @Test
    public void testThePoly() {
        Account a = new CurrentAccount();
        CurrentAccount b = new CurrentAccount();
        System.out.println(a.getAccountName());
        System.out.println(a.getAccountNumber());
        System.out.println(a.accountNumber);
        System.out.println(b.getAccountName());
        System.out.println(b.getAccountNumber());
        System.out.println(b.accountNumber);

        //overriding static method
        System.out.println(Account.getClassName());
        System.out.println(a.getClassName());
        System.out.println(CurrentAccount.getClassName());
        System.out.println(b.getClassName());

    }

    @MyAnnotation
    @Test
    public void testTheAnnotation() throws NoSuchMethodException {
        Method method = this.getClass().getMethod("testTheAnnotation");
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
    }

    @Test
    public void testCloneable() {
        CurrentAccount ca = new CurrentAccount("191-SA").setLocation("Night City");
        CurrentAccount ca2 = ca.clone();
        CurrentAccount ca3 = ca;
        logger.info(" is ca==ca2: {} , is ca.equals(ca2): {}, ca is {} and ca2 {} ", ca == ca2, ca.equals(ca2), ca, ca2);
        logger.info(" is ca==ca3: {} , is ca.equals(ca3): {}, ca is {} and ca3 {} ", ca == ca3, ca.equals(ca3), ca, ca3);

    }

    public void printMessage(Object obj){
        logger.info("object method is invoked");
    }
    public void printMessage(String obj){
        logger.info("String method is invoked");
    }

    @Test
    void testTheOverloading(){
        printMessage(null);
    }

}
