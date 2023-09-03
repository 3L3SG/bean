package com.learn.learnjava.jdk;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Stream;

class JavaNine {

    @Test
    void takeWhile() {
        //takeWhile ordered list
        System.out.println("takeWhile ordered list");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).takeWhile(i -> i < 4).forEach(System.out::println);
        //takeWhile unordered list
        System.out.println("takeWhile unordered list");
        Stream.of(1, 2, 5, 3, 5, 6, 7, 8, 9).takeWhile(i -> i < 4).forEach(System.out::println);

        //dropWhile ordered list
        System.out.println("dropWhile ordered list");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).dropWhile(i -> i < 4).forEach(System.out::println);
    }

    @Test
    void dropWhile() {
        //dropWhile ordered list
        System.out.println("dropWhile using ordered list");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).dropWhile(i -> i < 4).forEach(System.out::println);

        System.out.println("dropWhile using unordered list");
        Stream.of(9,1, 2, 5, 3, 6, 7, 8, 9).dropWhile(i -> i < 4).forEach(System.out::println);
    }

    @Test
    void streamIterate() {
        //dropWhile ordered list
        System.out.println("stream iterate");
        Stream.iterate(2, x -> x < 20, x -> x * x).forEach(System.out::println);

        Stream.iterate("T", X -> X.length() < 5, X -> X + "T").forEach(System.out::println);
    }

    @Test
    void streamNullable() {
        System.out.println("stream nullable");
        Stream.ofNullable(1).forEach(System.out::println);
        Stream.ofNullable("T").forEach(System.out::println);
        Stream.ofNullable(null).forEach(System.out::println);
//        Stream.of(null).forEach(System.out::println);
    }

    @Test
    void immutableSet() {
        System.out.println("immutable set");
        Set<String> a = Set.of("A", "B", "C");
        a.forEach(System.out::println);
    }

    @Test
    void testSummaryStats(){
        System.out.println(Arrays.asList(5,3,9,4,1,7).stream().mapToInt(x->x).summaryStatistics().getAverage());

        System.out.println(Arrays.asList(5,8,9,4,1,7).stream().mapToDouble(x->x).summaryStatistics().getAverage());

        System.out.println(null instanceof Object);
    }




}
