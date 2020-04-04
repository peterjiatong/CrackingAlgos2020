package Lesson11252019;

public class L92ReverseLinkedListII {
    public class ListNode {
       int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode reverseBetween(ListNode head, int m, int n) {
    if (head == null || head.next == null) return head;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode tail = dummy;
    ListNode newHead = head;
    ListNode newTail = head;

        for (int i = 1; i < m; i++) {
            tail = newHead;
            newHead = newHead.next;
        }

        for (int i = 1; i < n; i++) {
            newTail = newTail.next;
        }

        while(newHead != newTail){
            tail.next = newHead.next;
            newHead.next = newTail.next;
            newTail.next = newHead;
            newHead = tail.next;
        }

        return dummy.next;
    }

}
