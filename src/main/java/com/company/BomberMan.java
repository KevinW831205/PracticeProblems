package com.company;

public class BomberMan {

    static String[] bomberMan(int n, String[] grid) {
        String[] result = new String[grid.length];
        for (int i = 0; i < grid.length; i++) {
            String row = "";
            for (int j = 0; j < grid[i].length(); j++) {
                row += "O";
            }
            result[i] = row;
        }
        if (n == 1) {
            return grid;
        } else if (n % 2 == 0) {
            return result;
        } else {
            String[] grid2SecAgo = bomberMan(n - 2, grid);
            for (int i = 0; i < grid2SecAgo.length; i++) {
                System.out.println("at i" + i);
                System.out.println("bp: " + grid2SecAgo[0]);
                System.out.println("before: " + result[0]);
                for (int j = 0; j < grid2SecAgo[i].length(); j++) {
                    if (grid2SecAgo[i].charAt(j) == 'O') {
                        if (j == 0 && i == 0) {
                            result[i] = ".." + result[i].substring(2);
                            result[i + 1] = "." + result[i + 1].substring(1);
                        } else if (i == 0 && j == grid2SecAgo[i].length() - 1) {
                            result[i] = result[i].substring(0, result[i].length() - 2) + "..";
                            result[i + 1] = result[i + 1].substring(0, result[i + 1].length() - 1) + ".";
                        } else if (i == result.length - 1 && j == 0) {
                            result[i] = ".." + result[i].substring(2);
                            result[i - 1] = "." + result[i - 1].substring(1);
                        } else if (i == result.length - 1 && j == grid2SecAgo[i].length() - 1) {
                            result[i] = result[i].substring(0, result[i].length() - 2) + "..";
                            result[i - 1] = result[i - 1].substring(0, result[i - 1].length() - 1) + ".";
                        } else if (i == 0) {
                            result[i] = result[i].substring(0, j - 1) + "..." + result[i].substring(j + 2);
                            result[i + 1] = result[i + 1].substring(0, j) + "." + result[i + 1].substring(j + 1);
                        } else if (j == 0) {
                            result[i] = ".." + result[i].substring(2);
                            result[i + 1] = "." + result[i + 1].substring(1);
                            result[i - 1] = "." + result[i - 1].substring(1);
                        } else if (i == result.length - 1) {
                            result[i] = result[i].substring(0, j - 1) + "..." + result[i].substring(j + 2);
                            result[i - 1] = result[i - 1].substring(0, j) + "." + result[i - 1].substring(j + 1);
                        } else if (j == grid2SecAgo[i].length() - 1) {
                            result[i] = result[i].substring(0, j - 1) + "..";
                            result[i + 1] = result[i + 1].substring(0, j) + ".";
                            result[i - 1] = result[i - 1].substring(0, j) + ".";
                        } else {
                            result[i] = result[i].substring(0, j - 1) + "..." + result[i].substring(j + 2);
                            result[i + 1] = result[i + 1].substring(0, j) + "." + result[i + 1].substring(j + 1);
                            result[i - 1] = result[i - 1].substring(0, j) + "." + result[i - 1].substring(j + 1);
                        }
                    }
                    if (i == 0) {
                        System.out.println("j" + j + " " + result[0]);
                    }
                }
                System.out.println("after: " + result[0]);

//                for(String s : result){
//                    System.out.println(s);
//                }
            }
            System.out.println("sec = " + n);
            for (String s : result) {
                System.out.println(s);
            }
            return result;
        }
    }
}

/*
OOO.O.O
OO.....
OO....O
.......
.......
.......
 */