package com.company;

import org.junit.Assert;
import org.junit.Test;

public class SearchRotatedTest {
    public void searchTest(int expected, int[] input, int target) {
        int actual = SearchRotated.search(input, target);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        searchTest(4, new int[] {4,5,6,7,0,1,2}, 0);
    }


    @Test
    public void test2() {
        searchTest(-1, new int[] {4,5,6,7,0,1,2}, 3);
    }

    @Test
    public void test3() {
        searchTest(-1, new int[] {1}, 0);
    }

    @Test
    public void test4() {
        searchTest(0, new int[] {1}, 1);
    }

    @Test
    public void test5() {
        searchTest(5, new int[] {4,5,6,7,0,1,2}, 1);
    }

    @Test
    public void test6() {
        searchTest(4, new int[] {4,5,6,7, 8, 1, 2,3}, 8);
    }
}
