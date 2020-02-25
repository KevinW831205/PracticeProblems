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
        Res res =  new Res();
        res.val = Integer.MIN_VALUE;

        maxUtil(root,res);
        return res.val;
    }

    public PyramidNode getRoot() {
        return root;
    }

    private int maxUtil(PyramidNode node, Res res) {
        if (node == null) {
            return 0;
        }

        int leftMax = maxUtil(node.getLeftChild(), res);
        int rightMax = maxUtil(node.getRightChild(), res);

        int max = Math.max(Math.max(rightMax, leftMax) + node.getValue(), node.getValue());

//        int maxTop = Math.max(max, leftMax + rightMax + node.getValue());

        res.val = Math.max(res.val, max);

        return max;
    }
}

class Res {
    public int val;
}
