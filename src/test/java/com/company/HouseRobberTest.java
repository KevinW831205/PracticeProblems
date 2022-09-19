package com.company;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberTest {

    public void houseRobberTest(int expected, int[] input) {
        int actual = new HouseRobber().rob(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        houseRobberTest(6, new int[]{1,2,3,4});
    }

    @Test
    public void test2() {
        houseRobberTest(4, new int[]{1,2,3,1});
    }

    @Test
    public void test3() {
        houseRobberTest(12, new int[] {2,7,9,3,1});
    }


}
