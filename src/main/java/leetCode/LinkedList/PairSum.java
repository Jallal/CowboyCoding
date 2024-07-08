/**
 * 
 * n a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
The twin sum is defined as the sum of a node and its twin.

Given the head of a linked list with even length, return the maximum twin sum of the linked list.
 * 
 * 
 * Solution
 * Explanation:
This solution aims to find the maximum pair sum of nodes in a linked list. Here's an explanation of the approach:

Find the Middle of the Linked List:

Use the slow and fast pointer approach to find the middle of the linked list.
This is done by moving the slow pointer one step at a time and the fast pointer two steps at a time until the fast pointer reaches the end of the list or the second-to-last node.
Reverse the Second Half of the Linked List:

Reverse the second half of the linked list starting from the node after the middle.
This is done to easily compare nodes from the first half with their corresponding nodes in the reversed second half.
Find the Maximum Pair Sum:

Iterate through the original and reversed linked lists simultaneously, starting from the head of the linked list.
Calculate the sum of the current pair of nodes (one from the original list and one from the reversed list).
Keep track of the maximum pair sum encountered during the iteration.
Return the Maximum Pair Sum:

After the iteration is complete, return the maximum pair sum found.
Time Complexity:
The time complexity is O(n), where n is the number of nodes in the linked list. This is because we iterate through the linked list once to find the middle, once to reverse the second half, and once to find the maximum pair sum.
Space Complexity:
The space complexity is O(1) because the reversal of the second half is done in-place without using any additional space proportional to the size of the input.
 * 
 * 
 * 
 * 
 * 
*/








/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
package leetCode.LinkedList;

import leetCode.dividAndConquer.ListNode;

public class PairSum {

    public int pairSum(ListNode head) {
        int max =0;

        if(head ==null){
            return max;
        }

        //find the middle of the linkedlist
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        //reverse the remaining half of the list
        ListNode start = head;
         while(slow.next != null){
            //start comaring the start and reversed string heads

            max = Math.max(start.val+slow.next.val,max);
            start = start.next;
            slow = slow.next;
         }
         return max;
    }

   private ListNode reverse(ListNode head){

    ListNode prev=null;
    ListNode curr = head;
    ListNode next = head;

     while(next!=null){
        next = curr.next;
        curr.next=prev;
        prev=curr;
        curr = next;
     }
     return prev;
   }

}