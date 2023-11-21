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

        List<Integer> list = new ArrayList();

         ListNode temp = head;
         while(temp!=null){
             list.add(temp.val);
             temp = temp.next;
         }

         Collections.sort(list);
        ListNode newNode = new ListNode(0);
        ListNode temp2 = newNode;
         for(int num : list){
             temp2.next = new ListNode(num);
             temp2 = temp2.next;
         }
         return newNode.next;
    }
}