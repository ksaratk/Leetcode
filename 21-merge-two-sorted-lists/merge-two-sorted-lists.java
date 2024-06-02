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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        ListNode left = list1;
        ListNode right = list2;
        
        while(left != null && right != null){
            if(left.val < right.val){
                temp.next = new ListNode(left.val);
                temp = temp.next;
                left = left.next;
            } else {
                temp.next = new ListNode(right.val);
                temp = temp.next;
                right = right.next;
            }
        }
        
        while(left != null){
                temp.next = new ListNode(left.val);
                temp = temp.next;
                left = left.next;
            }
        while(right != null){
                temp.next = new ListNode(right.val);
                temp = temp.next;
                right = right.next;
            }
        return ans.next;
    }
}