package com.company;

import java.util.Arrays;
import java.util.Set;

public class Finder {

    static boolean pathFinder(String maze) {
        // Your code here!!

        Set<Node> moveAbleNode;

        String[] s = {};

        String[] mazeRow = maze.split("\n");
        String[][] mazeArr = Arrays.stream(mazeRow)
                .map(r -> r.split(""))
                .toArray(String[][]::new);



        return false;
    }



}

class Node{
    Integer posx;
    Integer posy;
    Set<Node> movableNodes;

    public Node(Integer posx, Integer posy, Set<Node> movableNodes) {
        this.posx = posx;
        this.posy = posy;
        this.movableNodes = movableNodes;
    }

    public Integer getPosx() {
        return posx;
    }

    public Integer getPosy() {
        return posy;
    }

    public Set<Node> getMovableNodes() {
        return movableNodes;
    }
}
