package com.company;

import org.junit.Assert;
import org.junit.Test;

public class ClimbStairsTest {

    public void climbStairTest(int expected, int input) {
        int actual = new ClimbStairs().climbStairs(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        climbStairTest(2,2);
    }
    @Test
    public void test2() {
        climbStairTest(3, 3);
    }
    @Test
    public void test3() {
        climbStairTest(5, 4);
    }

    @Test
    public void test4() {
        climbStairTest(0, 8);
    }

}
