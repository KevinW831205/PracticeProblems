package com.company.Problems12242019;

public class SurfaceArea3D {

    public static int surfaceArea(int[][] A) {

        int areaTopAndBottom = A.length * A[0].length * 2;
        int areaForwardBackward = 0;
        int areaLeftRight = 0;

        for (int i = 0; i < A.length; i++) {
            areaLeftRight += A[i][0] + A[i][A[i].length - 1];
            for (int j = 1; j < A[i].length; j++) {
                areaLeftRight += A[i][j] - A[i][j-1];
            }
        }

        for (int i = 0; i < A[i].length; i++) {
            areaForwardBackward += A[0][i] +A[A[0].length-1][i];
            for (int j = 1; j < A.length; j++) {
                areaForwardBackward += A[j][i] - A[j-1][i];
            }
        }

        /*
        60
        1,3,4       8
        2,2,3       6
        1,2,4       8     4 6 10    9 9
         */

        return areaTopAndBottom + areaLeftRight + areaForwardBackward;

    }


}
