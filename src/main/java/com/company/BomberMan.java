package com.company;

public class BomberMan {

    static String[] bomberMan(int n, String[] grid) {
        String[] result = new String[grid.length];

        if(n == 1){
            return grid;
        } else if (n % 2 == 0) {
            for (int i = 0; i < grid.length; i++) {
                String row = "";
                for (int j = 0; j < grid[i].length(); j++) {
                    row += "O";
                }
                result[i] = row;
            }
        } else {
        }
        return result;
    }

}
