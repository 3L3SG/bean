package com.learn.learnjava.runners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class VariablesTest {
    private static final Logger logger = LogManager.getLogger(VariablesTest.class);

    @Test
    void testTheTest() {
        int a = 1;
        int b = 10;
        int c = 100;
        int d = 127;
        int e = 128;
        int f = 129;
        byte aa = (byte) a;
        byte bb = (byte) b;
        byte cc = (byte) c;
        byte dd = (byte) d;
        byte ee = (byte) e;
        byte ff = (byte) f;

        logger.info("after typecasting int {} to byte is {}", a, aa);
        logger.info("after typecasting int {} to byte is {}", b, bb);
        logger.info("after typecasting int {} to byte is {}", c, cc);
        logger.info("after typecasting int {} to byte is {}", d, dd);
        logger.info("after typecasting int {} to byte is {}", e, ee);
        logger.info("after typecasting int {} to byte is {}", f, ff);

    }

    @Test
    void testUnaryOperators() {
        int x = 10;
        logger.info("base value is {} ", x);
        logger.info("x++ value is {} ", x++);
        logger.info("++x value is {} ", ++x);
        logger.info("x++ value is {} ", x++);
        logger.info("x value is {} ", x);
        logger.info("10*10/5+3-1*4/2 value is {} ", 10 * 10 / 5 + 3 - 1 * 4 / 2);
    }

    @Test
    void TestThePremitive() {
        int n = 10;
        String s[] = {"1", "2", "3"};
        Stream.of(s).forEach(System.out::println);

    }

    @Test
    void testTheArray() {
        int[] a = {1, 2};
        System.out.println(a);
        System.out.println(a.getClass().getName());
        System.out.println(a.getClass().getCanonicalName());
        System.out.println(a.getClass().getTypeName());
        System.out.println(a.getClass().getSimpleName());

        int b=10;
        System.out.println(b);

        char c=100;
        char d='d';
        char f=(char)c;
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(String.valueOf(a));
    }

    @Test
    void testTheDouble(){
        System.out.println(1.0/0.0);
    }
}
