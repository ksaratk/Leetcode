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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode list = new ListNode(0);
        ListNode temp = list;
        ListNode headTemp = head;
        int count = 1;
        while(headTemp!=null){
            if(count%2 == 1){
                temp.next = new ListNode(headTemp.val);
                temp = temp.next;
            }
            count++;
            headTemp = headTemp.next;
        }
        
        ListNode temp2 = list;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        ListNode headTemp2 = head;
        count = 1;
        while(headTemp2!=null){
            if(count%2 == 0){
                temp2.next = new ListNode(headTemp2.val);
                 temp2 = temp2.next;
            }
            count++;
            headTemp2 = headTemp2.next;
        }
        
        return list.next;
    }
}