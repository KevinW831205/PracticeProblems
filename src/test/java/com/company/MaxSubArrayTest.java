package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MaxSubArrayTest {
    public void testMaxSubArray(int expected, int[] input) {
        int actual = new MaxSubArray().maxSubArray(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        testMaxSubArray(-1, new int[] { -1, -2});
    }

    @Test
    public void test2() {
        testMaxSubArray(1, new int[] { 1});
    }
    @Test
    public void test3() {
        testMaxSubArray(6, new int[] { -2, 1, -3,4,-1,2,1,-5,-4});
    }

    @Test
    public void test4() {
        testMaxSubArray(23, new int[] { 5,4,-1,7,8});
    }

}
