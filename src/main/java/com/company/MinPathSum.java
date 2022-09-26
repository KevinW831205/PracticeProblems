package com.company;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int[][] memo = new int[grid.length][grid[0].length];

        return this.findMinPath(grid,0,0,memo);
    }

    private int findMinPath(int[][] grid, int posX, int posY, int[][] memo) {
        int maxX = grid[0].length - 1;
        int maxY = grid.length - 1;
        if (posX == maxX && posY == maxY) {
            memo[maxY][maxX] = grid[maxY][maxX];
            return grid[maxY][maxX];
        }
        int fromMemo = memo[posY][posX];
        if (fromMemo != 0) {
            return fromMemo;
        }
        int minVal;
        if (posX == maxX) {
            minVal = grid[posY][posX] + findMinPath(grid, posX, posY + 1, memo);
        } else if (posY == maxY) {
            minVal = grid[posY][posX] + findMinPath(grid, posX + 1, posY, memo);
        } else {
            minVal = grid[posY][posX] +
                    Math.min(findMinPath(grid, posX + 1, posY, memo), findMinPath(grid, posX, posY + 1, memo));
        }
        memo[posY][posX] = minVal;
        return minVal;
    }

}
