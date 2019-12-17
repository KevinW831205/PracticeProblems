package com.company;

public class GridSearch {

    static String gridSearch(String[] G, String[] P) {

        if(containsPattern(G,P)){
            return "YES";
        } else{
            return "NO";
        }
    }

    private static boolean containsPattern(String[] g, String[] p) {
        int width = p[0].length();
    }


}
