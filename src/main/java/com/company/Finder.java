package com.company;

import java.util.Arrays;

public class Finder {

    static boolean pathFinder(String maze) {
        // Your code here!!

        String[] s = {};

        String[] mazeRow = maze.split("\n");
        String[][] mazeArr = Arrays.stream(mazeRow)
                .map(r -> r.split(""))
                .toArray(String[][]::new);

        return false;
    }

    private static boolean hasTopBottomRoute(String[][] maze) {

    }

    private static boolean hasRightLeftRoute(String[][] maze) {

    }


}
