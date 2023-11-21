/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA!=tempB){
            tempB = tempB==null ?  headA : tempB.next;
            tempA = tempA==null ?  headB : tempA.next;
        }
        return tempA;
    }
}