import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        RotateImage helper = new RotateImage();
        int[][] m = new int[][]{new int[]{5,1,9,11}, new int[]{2,4,8,10}, new int[]{13,3,6,7}, new int[]{15,14,12,16}};
        helper.rotate(m);
        Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
    }
    public void rotate(int[][] matrix) {
        int row = 0;
        while (row < matrix.length / 2) {
            for (int i = row; i < matrix.length - 1 - row; i++) {
                System.out.println("row"+ row);
                System.out.println("col"+i);
                rotate(matrix, i, row);
            }
            row++;
        }
    }

    private void rotate(int[][] matrix, int y1, int x1) {
        int c1 = matrix[y1][x1];
        int c2 = matrix[x1][matrix.length - 1 - y1];
        int c3 = matrix[matrix.length - 1 - y1][matrix.length - 1 - x1];
        int c4 = matrix[matrix.length - 1 - x1][y1];

        matrix[y1][x1] = c4;
        matrix[x1][matrix.length - 1 - y1] = c1;
        matrix[matrix.length - 1 - y1][matrix.length - 1 - x1] = c2;
        matrix[matrix.length - 1 - x1][y1] = c3;
    }
}
