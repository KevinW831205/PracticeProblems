package com.company;

import java.util.Arrays;
import java.util.stream.Collector;

public class Finder {

    static boolean pathFinder(String maze) {
        // Your code here!!

        String[] s =  {};

        String[] mazeRow = maze.split("\n");
        String[][] mazeArr = Arrays.stream(mazeRow)
                .map(r -> r.split(""))
                .toArray(String[][]{} );

        for(String[] row : mazeArr){
            for(String c : row){
                System.out.println(c);
            }
        }

        return false;
    }

    class maze {


    }

    class node {

    }
}
