package com.company;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntTest {
    public void reverseTest(int expected, int input) {
        int actual = ReverseInteger.reverse(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        reverseTest(321, 123);
    }

    @Test
    public void test2() {
        reverseTest(-321, -123);
    }

    @Test
    public void test3() {
        reverseTest(21, 120);
    }

    @Test
    public void test4() {
        reverseTest(0, 1000000009);
    }
}
