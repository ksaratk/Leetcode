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
    public int diameterOfBinaryTree(TreeNode root) {
        int [] result = new int[1];
        System.out.print(helper(root, result));
        return result[0];
    }
    
    public int helper(TreeNode root,  int[] max){
        if(root == null) return 0;
        
        int lh = helper(root.left, max);
        int rh = helper(root.right, max);
        max[0] = Math.max(max[0], lh+rh);
        return 1 + Math.max(lh, rh);
    }
}