package com.company;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class FactDecomp {

    public static String decomp(int n) {
        // your code
        SortedMap<Integer, Integer> result = new TreeMap<>();
        for (int i = 2; i <= n; i++) {

        }

    }

    public Map<Integer, Integer> primeFactors(int n) {
        SortedMap<Integer, Integer> result = new TreeMap<>();

        while (n % 2 == 0) {
            result.put(2, result.getOrDefault(2, 0) + 1);
        }
        return result;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


