package leetCode.LinkedList;

public class FindMiddleOfLinkedList_2095 {

    public ListNode deleteMiddle(ListNode head) {

        if(head==null || head.next==null){
            return null;
        }

        //find the middle of the tree
        ListNode slow = head;
        ListNode fast = head.next;

        while(slow!=null&&fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        ListNode newHead = head;
        while(newHead!=null&&newHead.next!=null){
          if(newHead.next==mid){
            ListNode temp = newHead.next;
             newHead.next = newHead.next.next;
          }
          newHead = newHead.next;
        }

        return head;

    }


}