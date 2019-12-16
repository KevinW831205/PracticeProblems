package com.company;

public class Cavity {

    public static void main(String[] args) {
        String[] res = cavityMap( new String[]{"1112", "1912", "1892","1234"});
        for(String s : res){
            System.out.println(s);
        }

    }

    static String[] cavityMap(String[] grid) {

        String[] result = new String[grid.length];
        int rows = grid.length;

        result[0] = grid[0];

        for (int i = 1; i < grid.length - 1; i++) {
            String row = grid[i];
            for (int j = 1; j < grid[i].length() - 1; j++) {
                if (checkSides(grid[i].charAt(j),grid, i, j)){
                    // change to X
                    row = row.substring(0,j) + "X" + row.substring(j+1);
                }

                result[i] = row;
            }
        }
        result[grid.length-1] = grid[grid.length-1];


        return result;
    }

    private static boolean checkSides(Character val, String[] grid, int i, int j) {
        int value = (int) val;
        if (
                (int) grid[i].charAt(j - 1) > value || (int) grid[i].charAt(j + 1) > value ||
                        (int) grid[i-1].charAt(j) >value || (int) grid[i+1].charAt(j)>value
        ) {
            return false;
        }
        return true;
    }
}
