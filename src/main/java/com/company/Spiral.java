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
        moveRightUntilEndAndMoveDown();
    }

    private void moveRight() {
        x++;
        mark();
    }

    private void moveLeft() {
        x--;
        mark();
    }

    private void moveUp() {
        y--;
        mark();
    }

    private void moveDown() {
        y++;
        mark();
    }

    private void moveRightUntilEndAndMoveDown() {
        try {
            if (map[y][x + 1] == 0) {
                return;
            }
            while (!(map[y][x + 2] == 0)) {
                moveRight();
            }
            moveDownUntilEndAndMoveLeft();
        } catch (IndexOutOfBoundsException e) {
            moveDownUntilEndAndMoveLeft();
        }

    }

    private void moveDownUntilEndAndMoveLeft() {
        try {
            if (map[y + 1][x] == 0) {
                return;
            }
            while (!(map[y + 2][x] == 0)) {
                moveDown();
            }
            moveLeftUntilEndAndMoveUp();
        } catch (IndexOutOfBoundsException e) {
            moveLeftUntilEndAndMoveUp();
        }
    }

    private void moveLeftUntilEndAndMoveUp() {
        try {
            if (map[y][x - 1] == 0) {
                return;
            }

            while (!(map[y][x - 2] == 0)) {
                moveLeft();
            }
            moveUpUntilEndAndMoveRight();
        } catch (IndexOutOfBoundsException e) {
            moveUpUntilEndAndMoveRight();
        }
    }

    private void moveUpUntilEndAndMoveRight() {
        try {
            if (map[y - 1][x] == 0) {
                return;
            }
            while (!(map[y - 2][x] == 0)) {
                moveUp();
            }
            moveRightUntilEndAndMoveDown();
        } catch (IndexOutOfBoundsException e) {
            moveRightUntilEndAndMoveDown();
        }

    }
}
