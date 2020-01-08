package com.company;

public class AbsolutePermutation {
    static int[] absolutePermutation(int n, int k) {
        int[] result = new int[n];

        for(int i =1; i<=n; i++){
            if(i+k>=1 && i+k <= n){
                result[i-1] = i+k;
            } else if(i-k>=1 && i-k <=n){
                result[i-1] = i-k;
            } else {
                return new int[]{-1};
            }
        }
        return result;
    }

}
