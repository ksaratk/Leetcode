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

    public ListNode findMid(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
       if(head==null || head.next==null){
           return head;
       }

       ListNode mid = findMid(head);

       ListNode left = head;
       ListNode right = mid.next;
       mid.next = null; 

       left = sortList(left);
       right = sortList(right);
       ListNode result = mergeSort(left, right);
       return result;
    }
 
    public ListNode mergeSort(ListNode left, ListNode right){
        if(left==null){
            return left;
        }else if(right == null){
            return right;
        }
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while(left!=null && right!=null){
            if(left.val < right.val){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else{
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while(left!=null){
                temp.next = left;
                left = left.next;
                temp = temp.next;
        }

        while(right!=null){
                temp.next = right;
                right = right.next;
                temp = temp.next;
        }
        return ans = ans.next;
    }
}