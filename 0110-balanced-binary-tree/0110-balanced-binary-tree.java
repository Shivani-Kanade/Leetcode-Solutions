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
    public int level(TreeNode root){
        if(root == null) return 0;
        return 1+ Math.max(level(root.left) , level(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int levelOfleft = level(root.left);
        int levelOfRight = level(root.right);
       int diff =Math.abs(levelOfleft-levelOfRight);
       if(diff>1) return false;
       boolean lst = isBalanced(root.left);
       if(!lst) return false;
       boolean rst = isBalanced(root.right);
       if(!rst) return false;
       return true;
    }
    }