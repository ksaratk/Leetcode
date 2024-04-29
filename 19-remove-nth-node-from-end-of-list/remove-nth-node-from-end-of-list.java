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
        ListNode newNode = new ListNode(-1);
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        newNode.next = head;
        ListNode headTemp = newNode;
        n = count  - n;
        int count2 = 0;
        while(headTemp != null){
            if(count2 == n){
                headTemp.next = headTemp.next.next;
                return newNode.next;
            }
            count2++;
            headTemp = headTemp.next;
        }
         return head;
    }
}