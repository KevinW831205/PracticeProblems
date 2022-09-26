package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] x = new int[3][3];
        for (int[] r : x) {
            System.out.println(Arrays.toString(r));
        }
    }
}
