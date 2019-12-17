package com.company;

public class GridSearch {

    static String gridSearch(String[] G, String[] P) {

        if (containsPattern(G, P)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static boolean containsPattern(String[] g, String[] p) {
        int patternWidth = p[0].length();
        int patternHeight = p.length;
        int gridWidth = g[0].length();
        int gridHeight = g.length;

        for (int j = 0; j < gridHeight - patternHeight; j++) {
            for (int i = 0; i < gridWidth - patternWidth; i++) {
                String row = g[j];
                String sToCheck = row.substring(i,patternWidth+i);
                System.out.println(sToCheck);
                if (isEqualRow(sToCheck,p[0])){
                    boolean rowEqual = true;
                    for(int k=0; k<patternHeight; k++){
                        String checkingRow = g[j+k];
                        if(!isEqualRow(checkingRow.substring(i,patternHeight+i),p[k])){
                            rowEqual = false;
                            break;
                        }
                    }
                    if(rowEqual){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isEqualRow(String row1, String row2) {
        return row1.equals(row2);
    }


}
