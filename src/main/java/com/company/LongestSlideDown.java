package com.company;

public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {
        // Code Goes Here..

        Pyramid cPyramid = new Pyramid(pyramid);


        return cPyramid.findMaxSum();
    }


}

class PyramidNode {
    private int row;
    private int index;
    private PyramidNode leftChild;
    private PyramidNode rightChild;
    private int value;

    public PyramidNode(int[][] pyramid, int row, int index) {
        this.row = row;
        this.index = index;
        this.value = pyramid[row][index];
        try {
            leftChild = new PyramidNode(pyramid, row + 1, index);
        } catch (IndexOutOfBoundsException e) {
            leftChild = null;
        }
        try {
            rightChild = new PyramidNode(pyramid, row + 1, index + 1);
        } catch (IndexOutOfBoundsException e) {
            rightChild = null;
        }
    }

    public int getValue() {
        return value;
    }

    public PyramidNode getLeftChild() {
        return leftChild;
    }

    public PyramidNode getRightChild() {
        return rightChild;
    }
}

class Pyramid {
    private PyramidNode root;

    public Pyramid(int[][] pyramid) {
        this.root = new PyramidNode(pyramid, 0, 0);
    }

    public int findMaxSum() {
        return 0;
    }

    public PyramidNode getRoot() {
        return root;
    }
}

