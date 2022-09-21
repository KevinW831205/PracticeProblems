package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] in = {{1,3}, {2,6}, {8,10}, {15,18}, {1,2}};

        int[][] res = new MergeIntervals().merge(in);
        for (int[] interval : res) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> mergedInterval = new ArrayList();
        int left = intervals[0][0];
        int right = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            int currentLeft = intervals[i][0];
            int currentRight = intervals[i][1];
            if (currentLeft >= left && currentLeft <= right) {
                if (currentRight > right) {
                    right = currentRight;
                }
            } else {
                mergedInterval.add(new int[] {left, right});
                left = currentLeft;
                right = currentRight;
            }
        }
        mergedInterval.add(new int[] {left, right});

        mergedInterval.toArray(new int[][]{new int[0]});

        return mergedInterval.toArray(new int[][]{new int[0]});
    }
}
