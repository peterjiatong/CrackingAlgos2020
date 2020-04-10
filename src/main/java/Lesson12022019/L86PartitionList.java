package Lesson12022019;

public class L86PartitionList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode partition(ListNode head, int x) {
    if (head == null || head.next == null)return head;
    ListNode dummy1 = new ListNode(0);
    ListNode dummy2 = new ListNode(0);
    ListNode Cless = dummy1;
    ListNode Clarge = dummy2;
    ListNode cur = head;
    while(cur != null){
        if (cur.val < x){
            Cless.next = cur;
            Cless = Cless.next;
        }else {
            Clarge.next = cur;
            Clarge= Clarge.next;
        }
        cur=cur.next;
    }
    Clarge.next=null;
    Cless.next = dummy2.next;
    return dummy1.next;
    }
}
