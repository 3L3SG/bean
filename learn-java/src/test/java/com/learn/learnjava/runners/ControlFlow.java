package com.learn.learnjava.runners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ControlFlow {
    private static final Logger logger = LogManager.getLogger(ControlFlow.class);

    @Test
    void testTheSwitch() {
        //switch's case statement doesn't support variables
        int a = 10;
        int b = 10;
        switch (a) {
            case 10:
                logger.info("{} is matched", a);
                break;
            case 20:
                logger.info("{} is matched to value", a);
                break;
        }
    }

    @Test
    void testThePyramid() {
        var k = 10;
        for (var i = 0; i < k; i++) {
            for (var j = k; j > i; j--)
                System.out.print("# ");
            System.out.println();
        }

        for (var i = 0; i < k; i++) {
            for (var j = 0; j < i; j++)
                System.out.print("# ");
            System.out.println();
        }
    }

    @Test
    void testLabels() {
        a1:
        for (String s :
                List.of("a", "c", "b", "d")) {
           b1: for (var i : List.of(1, 2, 3)) {
                System.out.println(s);
                if (3 == i)
                    continue a1;
            }
        }
    }
}
