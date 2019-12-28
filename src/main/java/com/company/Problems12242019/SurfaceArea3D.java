package com.company.Problems12242019;

public class SurfaceArea3D {

    public static int surfaceArea(int[][] A) {

//        int areaTopAndBottom = A.length * A[0].length * 2;
//        int areaForwardBackward = 0;
//        int areaLeftRight = 0;
//
//        for (int i = 0; i < A.length; i++) {
//            areaLeftRight += A[i][0] + A[i][A[i].length - 1];
//            for (int j = 1; j < A[i].length; j++) {
//                areaLeftRight += Math.abs(A[i][j] - A[i][j - 1]);
//            }
//        }
//
//        for (int i = 0; i < A[0].length; i++) {
//            areaForwardBackward += A[0][i] + A[A[0].length - 1][i];
//            for (int j = 1; j < A.length; j++) {
//                areaForwardBackward += Math.abs(A[j][i] - A[j - 1][i]);
//            }
//            System.out.println("i " + areaForwardBackward);
//        }
//
//        return areaTopAndBottom + areaLeftRight + areaForwardBackward;


        // Someone else's solution
        int area = 0;

        for (int i = 0; i < A.length; i++) {
            int areaOfOneRow = A[i][0];
            for (int j = 0; j < A[i].length - 1; j++) {
                if (A[i][j + 1] > A[i][j]) {
                    areaOfOneRow += A[i][j + 1] - A[i][j];
                }
            }
            area += areaOfOneRow * 2;
        }

        for (int i = 0; i < A[0].length; i++) {
            int areaOfOneColumn = A[0][i];
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j + 1][i] > A[j][i]) {
                    areaOfOneColumn += A[j + 1][i] - A[j][i];
                }
            }
            area += areaOfOneColumn * 2;
        }

        area += A.length * A[0].length * 2;

        return area;

        /*
        60
        1,3,4       8
        2,2,3       6
        1,2,4       8     4 6 10    9 9
         */

//        System.out.println("top bottom " + areaTopAndBottom);
//        System.out.println("Left Right " + areaLeftRight);
//        System.out.println("Forward Backward" + areaForwardBackward);


    }


}
