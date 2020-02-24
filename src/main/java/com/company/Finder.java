package com.company;

import java.util.*;

public class Finder {


    static boolean pathFinder(String maze) {
        // Your code here!!

        MyFinder myFinder = new MyFinder(maze);

        return myFinder.findPath();
    }


}

class MyFinder{
    String maze;

    String[][] mazeArr;
    Set<Node> openNodes = new HashSet<>();
    Set<Node> closedNodes = new HashSet<>();



    public MyFinder(String maze) {
        this.maze = maze;
    }


    public boolean findPath(){
        String[] mazeRow = maze.split("\n");
        mazeArr = Arrays.stream(mazeRow)
                .map(r -> r.split(""))
                .toArray(String[][]::new);

        Node startingNode = new Node(0,0);
        Node endNode = new Node(mazeArr.length-1, mazeArr[0].length-1);
        openNodes.add(startingNode);

        while(!openNodes.isEmpty()){
            Iterator<Node> iterator = openNodes.iterator();


            while (iterator.hasNext()){
                Node node = iterator.next();
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

        return closedNodes.contains(endNode);
    }

    private void addOpenNodes(int x, int y){
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

    @Override
    public String toString() {
        return "Node{" +
                "posx=" + posx +
                ", posy=" + posy +
                '}';
    }
}
