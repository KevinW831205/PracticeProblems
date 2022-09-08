package com.company;

import org.junit.Assert;
import org.junit.Test;

public class WaterContainerTest {

    public void maxAreaTest(int expected, int[] input) {
        int actual = WaterContainer.maxArea(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        maxAreaTest(1, new int[]{1, 1});
    }

    @Test
    public void test2() {
        maxAreaTest(49, new int[]{1,8,6,2,5,4,8,3,7});
    }
}
