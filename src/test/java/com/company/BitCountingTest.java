package com.company;

import org.junit.Assert;
import org.junit.Test;

public class BitCountingTest {

    public void bitCountingTest(int expect, int input) {
        int actual = BitCounting.countBits(input);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test1() {
        bitCountingTest(5,1234);
    }

    @Test
    public void test2() {
        bitCountingTest(1,4);
    }

    @Test
    public void test3() {
        bitCountingTest(3,7);
    }


}
