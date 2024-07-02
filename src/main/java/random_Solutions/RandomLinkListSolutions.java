package random_Solutions;

import java.util.*;
import random_Solutions.ListNode;

public class RandomLinkListSolutions {

    public static ListNode getMiddleOfLinkList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(slow!=null&&slow.next!=null&&fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
              fast= fast.next.next;
        }
        return slow;
    }


    public static ListNode reversALinkList(ListNode head){

        ListNode temp = head;
        ListNode newHead = null;

        while(temp!=null){
            ListNode holder = temp.next;
            temp.next = newHead;
            newHead= temp;
            temp = holder;
        }
        return newHead;
    }






public static void main(String[] args){

    ListNode head = new ListNode(1);
    ListNode second = new ListNode(2);
    head.next = second;
    ListNode third = new ListNode(3);
    second.next = third;
    ListNode fourth = new ListNode(4);
    third.next = fourth;
    ListNode fifth = new ListNode(5);
    fourth.next = fifth;
    ListNode sixth = new ListNode(6);
    fifth.next = sixth;
    ListNode seventh = new ListNode(7);
    sixth.next = seventh;
    ListNode eighth = new ListNode(8);
    seventh.next = eighth;

    //RandomLinkListSolutions.getMiddleOfLinkList(head);
    RandomLinkListSolutions.reversALinkList(head);
}



}
