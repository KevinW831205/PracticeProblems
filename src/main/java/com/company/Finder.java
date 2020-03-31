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

    public static int pathFinderShortest(String maze) {
        System.out.println(maze);



        return -1;
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

        FinderNode startingFinderNode = new FinderNode(0, 0);
        FinderNode endFinderNode = new FinderNode(mazeArr.length - 1, mazeArr[0].length - 1);

        Set<FinderNode> finderNodes = new HashSet<>();
        finderNodes.add(startingFinderNode);

        do {
            Set<FinderNode> openFinderNode = finderNodes.stream()
                    .filter(n -> !n.isChecked())
                    .collect(Collectors.toSet());

            for (FinderNode n : openFinderNode) {
                n.check();
                int x = n.getPosx();
                int y = n.getPosy();
                addOpenNodes(x + 1, y, finderNodes);
                addOpenNodes(x - 1, y, finderNodes);
                addOpenNodes(x, y + 1, finderNodes);
                addOpenNodes(x, y - 1, finderNodes);
            }
            if (openFinderNode.contains(endFinderNode)) {
                return true;
            }
            if (openFinderNode.isEmpty()) {
                return false;
            }

        } while (true);

    }

    private void addOpenNodes(int x, int y, Set<FinderNode> setToAdd) {
        try {
            if (mazeArr[x][y].equals(".")) {
                FinderNode finderNodeToAdd = new FinderNode(x, y);
                setToAdd.add(finderNodeToAdd);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

}

class FinderNode {
    private Integer posx;
    private Integer posy;
    private boolean checked = false;

    public FinderNode(Integer posx, Integer posy) {
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
        FinderNode finderNode = (FinderNode) o;
        return Objects.equals(posx, finderNode.posx) &&
                Objects.equals(posy, finderNode.posy);
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
