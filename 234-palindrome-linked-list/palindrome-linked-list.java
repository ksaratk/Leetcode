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
         // write your code here
          if(head ==null){
            return false;
        } else if(head.next == null){
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        ListNode reverse = prev;
        ListNode list = head;
        while(list!=null && reverse!=null){
            if(list.val!=reverse.val){
              return false;
            }
            list = list.next;
            reverse = reverse.next;
        }
        return true;
    }
}