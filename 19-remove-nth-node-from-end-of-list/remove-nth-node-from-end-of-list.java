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
        if(head==null || head.next == null){
            head = null;
            return head;
        }
        int size = 0;
        ListNode curr = head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        n = size-n;
        System.out.print(n);
        ListNode t = head;
        int count = 1;
        if(n==0){
            head = head.next;
            return head;
        }
        while(count!=n){
            t = t.next;
            count++;
        }
        t.next = t.next.next;
        return head;
    }
}