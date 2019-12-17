package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {


    static int[] stones(int n, int a, int b) {
        Set<Integer> result = new TreeSet<>();

        for(int i = 0; i<n; i++){
            result.add(a*(n-1-i) + b*(i));
        }

        int[] primative  = result.stream().mapToInt(Integer::intValue).toArray();
        for(int i : primative){
            System.out.println(i);
        }
        return primative;
    }

}
