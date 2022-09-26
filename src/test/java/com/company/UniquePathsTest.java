package com.company;

import org.junit.Assert;
import org.junit.Test;

public class UniquePathsTest {

    public void uniquePathTest(int expected, int input1, int input2) {
        int actual = new UniquePaths().uniquePaths(input1, input2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        uniquePathTest(28, 3, 7);
    }

    @Test
    public void test2() {
        uniquePathTest(3, 3, 2);
    }


    @Test
    public void test3() {
        uniquePathTest(193536720, 23, 12);
    }
}
