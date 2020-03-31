package com.company;

import java.util.ArrayList;
import java.util.List;

public class TreeByLevels {

    public static List<Integer> treeByLevels(Node node) {
        List<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        List<Node> nodeNextLevel = new ArrayList<>();
        nodeNextLevel.add(node);

        while (!nodeNextLevel.isEmpty()) {

            List<Node> temp = new ArrayList<>(nodeNextLevel);

            nodeNextLevel.clear();
            for(Node n : temp){
                result.add(n.value);
                if (n.left != null) {
                    nodeNextLevel.add(n.left);
                }
                if (n.right != null) {
                    nodeNextLevel.add(n.right);
                }
            }
        }
        return result;
    }


}
