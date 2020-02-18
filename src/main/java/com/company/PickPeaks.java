package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        // Your code here!
        Map<String, List<Integer>> result = new HashMap<>();
        result.put("pos", new ArrayList<>());
        result.put("peaks", new ArrayList<>());
        int pleatauPos = 0;
        int pleatauPeak = 0;
        boolean pleatau = false;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i-1]<arr[i]  && arr[i] == arr[i + 1]) {
                if (!pleatau) {
                    pleatauPos = i;
                    pleatauPeak = arr[i];
                }
                pleatau = true;
            } else {
                if(pleatau && arr[i] > arr[i+1] ){
                    List<Integer> pos = result.get("pos");
                    List<Integer> peak = result.get("peaks");
                    pos.add(pleatauPos);
                    peak.add(pleatauPeak);
                }
                pleatau = false;
            }
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                List<Integer> pos = result.get("pos");
                List<Integer> peak = result.get("peaks");
                pos.add(i);
                peak.add(arr[i]);
            }
        }
        return result;
    }
}
