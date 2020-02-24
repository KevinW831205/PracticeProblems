package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Finder {

    static String[][] mazeArr;
    static Set<Node> openNodes = new HashSet<>();
    static Set<Node> closedNodes = new HashSet<>();


    static boolean pathFinder(String maze) {
        // Your code here!!


        String[] mazeRow = maze.split("\n");
        mazeArr = Arrays.stream(mazeRow)
                .map(r -> r.split(""))
                .toArray(String[][]::new);

        Node startingNode = new Node(0,0);
        openNodes.add(startingNode);
        while(!openNodes.isEmpty()){
            for(Node node : openNodes){
                System.out.println(node);
                openNodes.remove(node);
                Integer x = node.getPosx();
                Integer y = node.getPosy();

                addOpenNodes(x-1,y);
                addOpenNodes(x+1,y);
                addOpenNodes(x,y-1);
                addOpenNodes(x,y+1);
                closedNodes.add(node);
            }
        }

        return false;
    }

    private static void addOpenNodes(int x, int y){
        try{
            if(mazeArr[x][y].equals(".")){
                Node nodeToAdd = new Node(x,y);
                if(!closedNodes.contains(nodeToAdd)){
                    openNodes.add(nodeToAdd);
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){

        }
    }
}


class Node{
    private Integer posx;
    private Integer posy;

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
}
