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

        SpiralPointer pointer = new SpiralPointer(result);
        pointer.spiral();


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
    int[][] map;

    public SpiralPointer(int[][] map) {
        this.x = 0;
        this.y = 1;
        this.map = map;
        mark();
    }

    public void mark() {
        map[y][x] = 0;
    }

    public void spiral() {
        moveRight();
    }

    public void moveRight() {
        try {
            while (!(map[y][x + 2] == 0 || map[y][x + 1] == 0)) {
                x++;
                mark();
            }
            moveDown();
        } catch (IndexOutOfBoundsException e) {
            moveDown();
        }
    }

    public void moveLeft() {
        x--;
        mark();
    }

    public void moveUp() {
        y++;
        mark();
    }

    public void moveDown() {
        try {
            while (!(map[y-1][x] == 0 || map[y-2][x] == 0)) {
                x++;
                mark();
            }
            moveDown();
        } catch (IndexOutOfBoundsException e) {
            moveDown();
        }

        y--;
        mark();
    }
}
