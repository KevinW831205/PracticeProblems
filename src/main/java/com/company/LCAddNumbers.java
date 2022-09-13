package com.company;

import java.util.ArrayList;

public class LCAddNumbers {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "";
        String s2 = "";


        do {
           s1 = s1 + l1.val;
        } while (l1.next != null);

        do {
            s1 = s1 + l2.val;
        } while (l2.next != null);

        Integer i1 = Integer.parseInt(s1, 10);
        Integer i2 = Integer.parseInt(s2, 10);

        Integer solution = i1 + i2;

        ArrayList<Integer> solutionList = new ArrayList<>();
        while (solution > 0) {
            solutionList.add(solution % 10);
            solution = solution / 10;
        }

        ListNode[] arrayOfNodes = new ListNode[solutionList.size()];

        for (int i = solutionList.size() - 1; i >= 0; i = i - 1) {
            ListNode currentNode = new ListNode(solutionList.get(i));
            arrayOfNodes[solutionList.size() - 1 - i] = currentNode;

            if (i == solutionList.size() -1) {
                break;
            }
            ListNode previousNode = arrayOfNodes[solutionList.size() - 2 - i];
            previousNode.next = currentNode;

        }

        return arrayOfNodes[0];

    }

}


//
//class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
//
