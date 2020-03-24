package com.company;

import org.junit.Assert;
import org.junit.Test;

public class SpiralTest {

    @Test
    public void test1() {
        int[][] actual = Spiral.spiralize(5);
        int[][] expected = new int[][]{
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 1},
                {1, 1, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1}
        };
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[][] actual = Spiral.spiralize(8);
        int[][] expected = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1}
        };
        Assert.assertArrayEquals(expected, actual);
    }
}
