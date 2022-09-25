package com.company;

public class RotateList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(1);
//        ListNode n3 = new ListNode(2);
        n1.next = n2;
//        n2.next = n3;

        ListNode s = new RotateList().rotateRight(n1, 2);
        while (s != null) {
            System.out.println(s.val);
            s = s.next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 0) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        ListNode fast;
        ListNode slow;

        fast = head;
        slow = head;
        for (int i = 0; i<k; i++) {
            if (fast.next != null) {
                fast=fast.next;
            } else {
                fast = head;
            }
        }


        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if (slow.next == null) {
            return head;
        }

        ListNode temp = slow.next;
        slow.next = null;
        fast.next = head;

        return temp;
    }
}

