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
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = null;
        
            while(temp.next != null){
                next = temp.next;
                 curr = next;
                 while(curr.next != null){
                     prev = curr;
                     curr = curr.next;
                 }     
                if(prev != null){
                prev.next = curr.next;
                prev = null;
                temp.next = curr;
                temp = curr;
                temp.next = next;
                }
                temp = next;
            }
    }
}