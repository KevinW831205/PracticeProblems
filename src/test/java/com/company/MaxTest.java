package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    public void maxTest(int expected, int[] input) {

        int actual = Max.sequence(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {

        maxTest(0, new int[]{});
    }

    @Test
    public void test2() {

        maxTest(6, new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }


}
