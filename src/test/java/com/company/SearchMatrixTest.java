package com.company;

import org.junit.Assert;
import org.junit.Test;

public class SearchMatrixTest {

    public void searchRangeMatrix(boolean expected, int[][] input, int target) {
        boolean actual = new SearchMatrix().searchMatrix(input, target);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        int[][] matrix = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        searchRangeMatrix(true, matrix, 3);
    }

    @Test
    public void test2() {
        int[][] matrix = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        searchRangeMatrix(false, matrix, 13);
    }

    @Test
    public void test3() {
        int[][] matrix = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        searchRangeMatrix(true, matrix, 23);
    }
}
