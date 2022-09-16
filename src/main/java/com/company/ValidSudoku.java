package com.company;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> rowSet = new HashSet<Character>();
            Set<Character> colSet = new HashSet<Character>();

            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) {
                        return false;
                    }
                    rowSet.add(board[i][j]);


                }
                if (board[j][i] != '.') {
                    if (colSet.contains(board[j][i])) {
                        return false;
                    }
                    colSet.add(board[j][i]);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Set<Character> gridSet = new HashSet<Character>();
                for (int k = 0; k < 3; k ++) {
                    for (int l = 0; l < 3; l++) {
                        char c = board[i*3+k][j*3+l];
                        if (c != '.') {
                            if (gridSet.contains(c)) {
                                return false;
                            }
                            gridSet.add(c);
                        }
                    }
                }
            }
        }

        return true;
    }
}
