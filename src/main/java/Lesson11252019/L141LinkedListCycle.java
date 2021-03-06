package Lesson11252019;

public class L141LinkedListCycle {
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

   public boolean hasCycle(ListNode head) {
     if (head == null || head.next == null){
           return false;
       }

       ListNode slow = head;
       ListNode fast = head.next;
       while(fast != slow){
           if (fast == null || fast.next == null){
               return false ;
           }
           slow = slow.next;
           fast = fast.next.next;
       }
       return true;
}
      }