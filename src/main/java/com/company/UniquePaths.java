package com.company;

import java.util.*;

public class UniquePaths {
    private Map<String, Integer> memo = new HashMap();

    public int uniquePaths(int m, int n) {
        return uniquePaths(m, n, 1, 1);
    }

    private Integer uniquePaths(int m, int n, int posY, int posX) {


        if (posX == n) {
            return 1;
        }
        if (posY == m) {
            return 1;
        }
        Integer fromMemo = memo.get(posY+","+posX);
        if (fromMemo != null) {
            return fromMemo;
        }
        Integer possiblePaths = uniquePaths(m, n, posY + 1, posX) + uniquePaths(m, n, posY, posX + 1);
        memo.put(posY+","+posX, possiblePaths);
        return possiblePaths;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        List<List<Integer>> memo = new ArrayList<List<Integer>>();
        for (int i = 0; i <obstacleGrid.length; i++) {
            memo.add(new ArrayList<Integer>(Collections.nCopies(obstacleGrid[0].length ,null)));
        }

        return uniquePathsWithObstacles(obstacleGrid, 0, 0, memo);
    }

    private Integer uniquePathsWithObstacles(int[][] obstacleGrid, int posX, int posY, List<List<Integer>> memo) {
        if (obstacleGrid[posY][posX] == 1) {
            return 0;
        }
        if (posY == obstacleGrid.length - 1 && posX == obstacleGrid[0].length - 1) {
            return 1;
        }
        Integer fromMemo = memo.get(posY).get(posX);
        if (fromMemo != null) {
            return fromMemo;
        }

        Integer possiblePaths = 0;
        if (posY < obstacleGrid.length - 1) {
            possiblePaths += uniquePathsWithObstacles(obstacleGrid, posX, posY + 1, memo);
        }
        if (posX <obstacleGrid[0].length - 1) {
            possiblePaths += uniquePathsWithObstacles(obstacleGrid, posX + 1, posY, memo);
        }
        memo.get(posY).set(posX, possiblePaths);
        return possiblePaths;
    }
}
