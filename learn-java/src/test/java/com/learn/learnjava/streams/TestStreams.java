package com.learn.learnjava.streams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStreams {

    @Test
    void testList() {
        //var arr= {{1,2},{3,4},{4,5}};

        //var arr2= {1,2,3,4,5};

        List<List<Integer>> inputList = List.of(List.of(1, 2), List.of(3, 4), List.of(4, 5));

        System.out.println(inputList.stream().flatMap(list-> list.stream()).collect(Collectors.toList()));
    }

}
