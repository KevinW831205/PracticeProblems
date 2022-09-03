package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    public void twoSumTest(int[] expected, int[] nums, int target) {
        int[] actual = TwoSum.twoSum(nums, target);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        twoSumTest(new int[]{0, 1}, new int[]{2,7,11,15}, 9);
    }

    @Test
    public void test2() {
        twoSumTest(new int[]{1,2}, new int[]{3,2,4}, 6);
    }

    @Test
    public void test3() {
        twoSumTest(new int[]{0,1}, new int[]{3,3}, 6);
    }

}
