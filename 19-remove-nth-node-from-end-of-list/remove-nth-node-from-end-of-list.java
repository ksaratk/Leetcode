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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count  = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        ListNode temp1 = head;
        n = count-n;
        if(n==0){
            head = head.next;
            return head;
        }
        int count2 = 1;
        while(n!=count2){
            temp1 = temp1.next;
            count2++;
        }
         System.out.println(count2);
        temp1.next = temp1.next.next;
        return head;
    }
}