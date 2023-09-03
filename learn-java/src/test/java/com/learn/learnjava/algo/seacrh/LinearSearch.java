package com.learn.learnjava.algo.seacrh;

import org.junit.jupiter.api.Test;

public class LinearSearch {

    @Test
    void testTheLinear() {
        int input = 5;

        int[] values = new int[]{1, 2, 5, 3, 9, 7, 2, 9};
        System.out.println("Array size is " + values.length);
        int index = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == input) {
                index = i;
                System.out.println("found value at " + index);
            }
        }

        if (index == -1) {
            System.out.println("Not found");
        }
    }
}
