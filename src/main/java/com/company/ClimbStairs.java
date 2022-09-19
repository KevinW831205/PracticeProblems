package com.company;

public class ClimbStairs {

    public int climbStairs(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] memo = new int[n];
        memo[0] = 1;
        memo[1] = 2;
        return climbStairs(n, memo);
    }

    public int climbStairs(int n, int[] memo) {
        if (memo[n - 1] > 0) {
            return memo[n - 1];
        } else {
            memo[n-1] =climbStairs(n - 1, memo) + climbStairs(n -2, memo);
            return memo[n-1];
        }
    }
}
