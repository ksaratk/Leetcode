/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return answer;
        queue.add(root);
        
        while(!queue.isEmpty()){
            int records = queue.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i<records; i++){
                if(queue.peek().left !=null ) queue.add(queue.peek().left);
                if(queue.peek().right !=null ) queue.add(queue.peek().right);
                list.add(queue.peek().val);
                queue.poll();
            }    
            answer.add(list);
        }
        return answer;
    }
}