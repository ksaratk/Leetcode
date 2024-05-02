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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode n = new ListNode(-1);
        n.next = head;
        ListNode prev = n;
        ListNode temp = head;
        
        while(temp.next!=null){
            if(temp.val == temp.next.val){              
                while(temp.next!=null && temp.val == temp.next.val){
                        temp.next = temp.next.next;
                }
                if(temp.next == null) {
                    prev.next = null;
                    } 
                else {
                    temp = temp.next;
                    prev.next = temp;
                    }  
            }else{
                temp = temp.next;
                prev = prev.next;
            }    
        }
        return n.next;
    }
}