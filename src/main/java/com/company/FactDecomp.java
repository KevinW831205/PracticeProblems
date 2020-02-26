package com.company;

import java.util.SortedMap;
import java.util.TreeMap;

public class FactDecomp {

    public static String decomp(int n) {
        // your code
        SortedMap<Integer, Integer> result = new TreeMap<>();
        for (int i = 2; i <= n; i++) {
            SortedMap<Integer, Integer> pf = primeFactors(i);
            pf.forEach((key, value) -> {
                result.put(key, result.getOrDefault(key, 0) + value);
            });
        }

        StringBuilder sb = new StringBuilder();
        result.forEach((key,value)->{
            sb.append(key);
            if(value>2){
                sb.append("^"+value);
            }
            sb.append(" * ");
        });

        return sb.substring(0,sb.length()-3);
    }

    private static SortedMap<Integer, Integer> primeFactors(int n) {
        SortedMap<Integer, Integer> result = new TreeMap<>();

        while (n % 2 == 0) {
            result.put(2, result.getOrDefault(2, 0) + 1);
            n /= 2;
        }
        for (int i = 3; i <= n; i += 2) {
            if (isPrime(i) && n % i == 0) {
                result.put(i, 1);
            }
        }
        return result;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


