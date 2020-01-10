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
        if(n == 1){
            return grid;
        } else if (n % 2 == 0) {
            return result;
        } else {
            String[] grid2SecAgo = bomberMan(n-2,grid);
            for(int i=0; i<grid2SecAgo.length; i++){

            }

        }
        return result;
    }
}
