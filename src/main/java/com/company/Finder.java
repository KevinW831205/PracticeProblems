package com.company;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Finder {


    static boolean pathFinder(String maze) {
        // Your code here!!

        System.out.println(maze);
        MyFinder myFinder = new MyFinder(maze);

        return myFinder.findPath();
    }


}

class MyFinder {
    String maze;
    String[][] mazeArr;

    public MyFinder(String maze) {
        this.maze = maze;
    }


    public boolean findPath() {
        String[] mazeRow = maze.split("\n");
        mazeArr = Arrays.stream(mazeRow)
                .map(r -> r.split(""))
                .toArray(String[][]::new);

        Node startingNode = new Node(0, 0);
        Node endNode = new Node(mazeArr.length - 1, mazeArr[0].length - 1);

        Set<Node> nodes = new HashSet<>();
        nodes.add(startingNode);

        do {
            Set<Node> openNode = nodes.stream()
                    .filter(n -> !n.isChecked())
                    .collect(Collectors.toSet());

            for (Node n : openNode) {
                n.check();
                int x = n.getPosx();
                int y = n.getPosy();
                addOpenNodes(x + 1, y, nodes);
                addOpenNodes(x - 1, y, nodes);
                addOpenNodes(x, y + 1, nodes);
                addOpenNodes(x, y - 1, nodes);
            }
            if (openNode.contains(endNode)) {
                return true;
            }
            if (openNode.isEmpty()) {
                return false;
            }

        } while (true);

    }

    private void addOpenNodes(int x, int y, Set<Node> setToAdd) {
        try {
            if (mazeArr[x][y].equals(".")) {
                Node nodeToAdd = new Node(x, y);
                setToAdd.add(nodeToAdd);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

}

class Node {
    private Integer posx;
    private Integer posy;
    private boolean checked = false;

    public Node(Integer posx, Integer posy) {
        this.posx = posx;
        this.posy = posy;
    }

    public Integer getPosx() {
        return posx;
    }

    public Integer getPosy() {
        return posy;
    }

    public boolean isChecked() {
        return checked;
    }

    public void check() {
        this.checked = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(posx, node.posx) &&
                Objects.equals(posy, node.posy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posx, posy);
    }

    @Override
    public String toString() {
        return "Node{" +
                "posx=" + posx +
                ", posy=" + posy +
                '}';
    }
}