package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MinPathSumTest {
    public void MinPathTest(int expected, int[][] input) {

        int actual = new MinPathSum().minPathSum(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        int[][] input = new int[][]{{1,3,1},{1,5,1}, {4,2,1}};
        MinPathTest(7, input);
    }

    @Test
    public void test2() {
        int[][] input = new int[][]{{1,2,3},{4,5,6}};
        MinPathTest(12, input);
    }
}
