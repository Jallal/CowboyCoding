package leetCode.LinkedList;

public class ReverseALinkList_206 {

    public ListNode reverseList(ListNode head) {

        if(head ==null){
          return head;
        } 
  
         ListNode newHead = null;
  
         while(head!=null){
          ListNode temp = head.next;
          head.next = newHead;
          newHead = head;
          head = temp;
         }
       return newHead; 
      }


}