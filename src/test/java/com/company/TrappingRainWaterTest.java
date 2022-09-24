package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TrappingRainWaterTest {

    public void trappingRainWaterTest (int expected, int[] input) {
        int actual = new TrappingRainWater().trap(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        trappingRainWaterTest(6, new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
    }

    @Test
    public void test2() {
        trappingRainWaterTest(9, new int[] {4,2,0,3,2,5});
    }
}
