package com.company;

import java.util.HashMap;
import java.util.Map;

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

}
