package com.company;

import org.junit.Assert;
import org.junit.Test;

public class SearchFirstLastTest {
    public void searchRangeTest(int[] expected, int[] nums, int target) {
        int[] actual = SearchFirstLast.searchRange(nums, target);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        searchRangeTest(new int[]{3,4}, new int[]{5,7,7,8,8,10}, 8);
    }

    @Test
    public void test2() {
        searchRangeTest(new int[]{-1, -1}, new int[]{5,7,7,8,8,10}, 6);
    }

    @Test
    public void test3() {
        searchRangeTest(new int[]{-1, -1}, new int[]{}, 8);
    }

    @Test
    public void test4() {
        searchRangeTest(new int[]{0, 0}, new int[]{1}, 1);
    }

    @Test
    public void test5() {
        searchRangeTest(new int[]{-1, -1}, new int[]{2, 2}, 3);
    }

    @Test
    public void test6() {
        searchRangeTest(new int[]{0, 1}, new int[]{2, 2}, 2);
    }

    @Test
    public void test7() {
        searchRangeTest(new int[]{2,2}, new int[]{1, 2, 3}, 3);
    }

    @Test
    public void test8() {
        searchRangeTest(new int[]{0,0}, new int[]{1, 3}, 1);
    }

    @Test
    public void test9() {
        searchRangeTest(new int[]{-1,-1}, new int[]{0,0,1,1,1,4,5,5}, 2);
    }

    @Test
    public void test10() {
        searchRangeTest(new int[]{1,1}, new int[]{1,2,3}, 2);
    }

    @Test
    public void test11() {
        searchRangeTest(new int[]{2,5}, new int[]{1,2,3,3,3,3,4,5,9}, 3);
    }
}
