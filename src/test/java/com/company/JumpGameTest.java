package com.company;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameTest {
    public void canJumpTest(boolean expected, int[] input) {
        boolean actual = new JumpGame().canJump(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        canJumpTest(false, new int[] {3,2,1,0,4});
    }

    @Test
    public void test2() {
        canJumpTest(true, new int[] {2,3,1,1,4});
    }

    @Test
    public void test3() {
        canJumpTest(true, new int[] {0});
    }

    @Test
    public void test4() {
        canJumpTest(true, new int[] {2, 0});
    }

    @Test
    public void test5() {
        canJumpTest(true, new int[] {2, 0, 2, 0, 0});
    }
}
