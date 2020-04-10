package Lesson12022019;

public class merge {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

    public ListNode Merge(ListNode head1,ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode l1 = head1, l2 = head2;
        while(l1 != null && l2 != null){
        cur.next = l1;
        l1 = l1.next;
        cur = cur.next;
        cur.next=l2;
        l2= l2.next;
        cur = cur.next;
        }
        cur.next =l1;
        return dummy.next;
    }

        }
}
