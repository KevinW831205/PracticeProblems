package com.company;

public class swapNodes {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode start = head;

        while (start != null) {
            System.out.println(start.val);
            start = start.next;
        }

        start = swapPairs(head);
        System.out.println("swap");
        while (start != null) {
            System.out.println(start.val);
            start = start.next;
        }

    }


    public static ListNode swapPairs(ListNode head) {
        /**
         1 - 2 - 3 - 4
         2 - 1 - 4 - 3

         1    2
         **/
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode newHead = head.next;

        ListNode n1 = head;
        ListNode n2 = head.next;
        ListNode temp = null;

        while (true) {

            n1.next = n2.next;
            n2.next = n1;
            if (temp != null) {
                temp.next = n2;
            }
            temp = n1;

            n1 = n1.next;
            if (n1 == null) {
                break;
            }

            n2 = n1.next;
            if (n2 == null) {
                break;
            }
        }


        return newHead;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


