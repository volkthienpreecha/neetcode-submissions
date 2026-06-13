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

class Solution {
    public boolean hasCycle(ListNode head) { 

        if (head == null || head.next == null) {
            return false; 
        }

        ListNode forwardHead = head; 
        ListNode backwardHead = head; 

        while (forwardHead != null && forwardHead.next != null) {
            backwardHead = backwardHead.next; 
            forwardHead = forwardHead.next.next; 

             if (backwardHead == forwardHead) {
                return true;
            }
        }

       

        return false; 
    }
}
