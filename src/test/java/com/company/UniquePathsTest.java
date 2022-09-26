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

    public void uniquePathTestWithObstacle(int expected, int[][] input) {
        int actual = new UniquePaths().uniquePathsWithObstacles(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testObstacle1() {
        uniquePathTestWithObstacle(2, new int[][]{{0,0,0}, {0,1,0}, {0,0,0}});
    }

    @Test
    public void testObstacle2() {
        uniquePathTestWithObstacle(7, new int[][]{{0,0,0,0}, {0,1,0,0}, {0,0,0,0},{0,0,1,0}, {0,0,0,0}});
    }


}
