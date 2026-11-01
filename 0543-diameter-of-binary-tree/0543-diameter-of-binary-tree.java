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
    static int maxDia;
    public  int level(TreeNode root ){
        if(root==null) return 0;
        int a = level(root.left) ;
        int  b = level(root.right);
        maxDia = Math.max(a+b,maxDia);
        return 1+ Math.max(a,b);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        level (root);
        return maxDia;
    }
}