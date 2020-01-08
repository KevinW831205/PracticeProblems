package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AbsolutePermutation {
    static int[] absolutePermutation(int n, int k) {
        Set<Integer> added = new HashSet<>();
        int[] result = new int[n];

        if (k != 0 && n % k == 0) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
                if (i - k >= 1 && i - k <= n && !added.contains(i - k)) {
                    result[i - 1] = i - k;
                    added.add(i - k);
                } else if (i + k >= 1 && i + k <= n && !added.contains(i + k)) {
                    result[i - 1] = i + k;
                    added.add(i + k);
                } else {
                    return new int[]{-1};
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
                if (i + k >= 1 && i + k <= n && !added.contains(i + k)) {
                    result[i - 1] = i + k;
                    added.add(i + k);
                } else if (i - k >= 1 && i - k <= n && !added.contains(i - k)) {
                    result[i - 1] = i - k;
                    added.add(i - k);
                } else {
                    return new int[]{-1};
                }
            }
        }

        return result;
    }

}
