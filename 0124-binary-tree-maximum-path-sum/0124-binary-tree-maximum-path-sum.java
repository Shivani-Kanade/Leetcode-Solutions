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
    int max;
    public int lineSum(TreeNode root){
        if(root==null) return 0;
       
        int leftSum = lineSum(root.left);
        int rightSum = lineSum(root.right);
        int pathSum = root.val;
        if(leftSum>0) pathSum+=leftSum;
        if(rightSum>0) pathSum+=rightSum;
        max = Math.max(max , pathSum);
        return root.val + Math.max(0,Math.max(rightSum , leftSum));

    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        max =Integer.MIN_VALUE;
        lineSum(root);
        return max;

    }
}