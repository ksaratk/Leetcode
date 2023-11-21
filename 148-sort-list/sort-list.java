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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode mid = getMid(head);

        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);
        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right){
        if(left==null){
            return left;
        } else if(right==null){
            return right;
        }

        ListNode temp = new ListNode(-1);
        ListNode n = temp;
        while(left!=null && right!=null){
            if(left.val<right.val){
                n.next = left;
                n = n.next;
                left = left.next;
            } else{
                n.next = right;
                n = n.next;
                right = right.next;
            }
        }

        while(left!=null){
            n.next = left;
            n = n.next;
            left = left.next;
        }

        while(right!=null){
            n.next = right;
            n = n.next;
            right = right.next;
        }
        return temp.next;
    }

    public ListNode getMid(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}