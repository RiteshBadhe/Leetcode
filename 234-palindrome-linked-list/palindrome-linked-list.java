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

    
    public boolean isPalindrome(ListNode head) {
        
      
        ListNode temp = head;

        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

          // 2. Reverse the second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        ListNode first = head;
        ListNode sec = prev;

        while (sec != null)
         { 
            if (first.val != sec.val)
             {
                return false; 
            }
            first = first.next; 
            sec = sec.next; 
            }
            return true;
    }

}