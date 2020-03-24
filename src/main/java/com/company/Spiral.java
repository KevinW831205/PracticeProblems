package com.company;

public class Spiral {

    public static int[][] spiralize(int size) {
        int[][] result = new int[size][];
        for (int i = 0; i < size; i++) {
            result[i] = new int[size];
            for (int j = 0; j < size; j++) {
                result[i][j] = 1;
            }
        }

        SpiralPointer pointer = new SpiralPointer();

        pointer.mark(result);



        for (int[] row : result) {
            for (int j : row) {
                System.out.print(j);
            }
            System.out.println("");
        }
        return result;
    }

}

class SpiralPointer {
    int x;
    int y;

    public SpiralPointer() {
        this.x = 0;
        this.y = 1;
    }

    public void mark(int[][] arr){
        arr[y][x] = 0;
    }
}
