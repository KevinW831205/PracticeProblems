package com.company;

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = findRow(matrix, target, 0, matrix.length -1);
        if (row < 0) {
            return false;
        } else {
            return binarySearch(matrix[row], target, 0 ,matrix[row].length - 1);
        }
    }

    private boolean isTargetWithinRowRange(int[] row, int target) {
        return row[0] <= target && target <= row[row.length - 1];
    }

    private boolean binarySearch(int[] row, int target, int l, int r) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (row[mid] == target) {
                return true;
            }

            if (row[mid] > target) {
                return binarySearch(row, target, l, mid - 1);
            }

            return binarySearch(row, target,mid + 1, r);
        }
        return false;
    }

    private int findRow(int[][] matrix, int target, int l, int r) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (isTargetWithinRowRange(matrix[mid], target)) {
                return mid;
            }

            if (matrix[mid][0] > target) {
                return findRow(matrix, target, l, mid - 1);
            }

            return findRow(matrix, target,mid + 1, r);
        }

        return -1;
    }
}
