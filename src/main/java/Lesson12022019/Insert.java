package Lesson12022019;

import Lesson11252019.L141LinkedListCycle;

public class Insert {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }


    public ListNode insert (ListNode head, int value){
        ListNode newNode = new ListNode(value);
        if (head == null || value <= head.val){
        newNode.next= head;
        return newNode;
        }

        ListNode prev = head;
        while (prev.next != null && prev.next.val < value){
            prev.next = prev.next.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;
        return head;
    }
    }
}
