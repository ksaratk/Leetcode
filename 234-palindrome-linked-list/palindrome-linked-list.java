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
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null &&  fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        while(slow!=null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

       ListNode secondHalf = prev;
       ListNode firstHalf = head;
       while(firstHalf!=null && secondHalf!=null){
           if(firstHalf.val!=secondHalf.val){
               return false;
           }
           firstHalf = firstHalf.next;
           secondHalf = secondHalf.next;
       }
       return true;
    }
}