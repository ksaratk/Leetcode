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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode temp = head;
        int countLength = 0;
        while(temp!=null){
            temp = temp.next;
            countLength++;
        }
        k = k%countLength;
        System.out.print(k);
        int count = 1;
        while(count<=k){
            ListNode curr = head;

            while(curr.next.next!=null){
                curr = curr.next;
            }
            ListNode next = curr.next;
            curr.next = curr.next.next;
            next.next = head;
            head = next;
            count++;
        }
        return head;
    }
}