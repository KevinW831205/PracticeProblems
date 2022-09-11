package com.company;

public class RemoveNthFromList {

    public static void main(String[] args) {
//[1]
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1){
            return null;
        }

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode fast = temp;
        ListNode slow = temp;


        for (int i = 0; i <= n; i++) {
            try {
                fast = fast.next;
            } catch (Exception e) {
                fast = null;
            }
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }


        slow.next = slow.next.next;


        return temp.next;
    }


     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

}
