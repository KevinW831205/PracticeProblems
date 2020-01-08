package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AbsolutePermutation {
    static int[] absolutePermutation(int n, int k) {
        int[] result = new int[n];
        Set<Integer> added = new HashSet<>();

        if (k == 0) {
            for (int i = 1; i <= n; i++) {
                result[i - 1] = i;
            }
        } else if (k == n / 2) {
            for (int i = 1; i <= n; i++) {
                if (i + k >= 1 && i + k <= n) {
                    result[i - 1] = i + k;
                } else if (i - k >= 1 && i - k <= n) {
                    result[i - 1] = i - k;
                }
            }
        } else if (n % (k*2) == 0) {
            for (int i = 1; i <= n / k; i++) {
                for (int j = 1; j <= k; j++) {
                    int index = k*(i-1)+j-1;
                    if (j % 2 == 1) {
                        result[index] = k * i + j;
                    } else {
                        result[index] = k * i - j;
                    }
                }
            }
        } else {
            return new int[]{-1};
        }

//        if (k != 0 && n % k == 0) {
//            for (int i = 1; i <= n; i++) {
//                System.out.println(i);
//                if (i - k >= 1 && i - k <= n && !added.contains(i - k)) {
//                    result[i - 1] = i - k;
//                    added.add(i - k);
//                } else if (i + k >= 1 && i + k <= n && !added.contains(i - k)) {
//                    result[i - 1] = i + k;
//                    added.add(i + k);
//                }
//            }
//        } else if (k == n / 2 || k == 0) {
//            for (int i = 1; i <= n; i++) {
//                System.out.println(i);
//                if (i + k >= 1 && i + k <= n) {
//                    result[i - 1] = i + k;
//                } else if (i - k >= 1 && i - k <= n) {
//                    result[i - 1] = i - k;
//                } else {
//                    return new int[]{-1};
//                }
//            }
//        } else {
//            return new int[]{-1};
//        }

        return result;
    }

}
