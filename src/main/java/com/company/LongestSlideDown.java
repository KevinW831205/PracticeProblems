package com.company;

public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {
        // Code Goes Here..

        Pyramid cPyramid = new Pyramid(new PyramidNode(pyramid[0][0]));




        return 0;
    }


}

class PyramidNode {
    private PyramidNode leftChild;
    private Pyramid rightChild;
    private int value;

    public PyramidNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public PyramidNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(PyramidNode leftChild) {
        this.leftChild = leftChild;
    }

    public Pyramid getRightChild() {
        return rightChild;
    }

    public void setRightChild(Pyramid rightChild) {
        this.rightChild = rightChild;
    }
}

class Pyramid {
    PyramidNode root;

    public Pyramid(PyramidNode root) {
        this.root = root;
    }

    public int findMaxSum() {
        return 0;
    }


}

