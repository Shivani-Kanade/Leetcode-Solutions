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
    // aply invert method for right subtree
    public  void invert(TreeNode root){
        if(root==null || (root.left==null && root.right==null)) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
    // checking if left and rightsubtrees are same or not
    private  boolean isSame(TreeNode root1 , TreeNode root2){
         if(root1==null &&  root2==null) return true;
        if(root1==null ||  root2==null) return false;
        if(root1.val != root2.val) return false;
        if(!isSame(root1.left,root2.left)) return false;
        if(!isSame(root1.right, root2.right)) return false;
        return true;
    }

    public boolean isSymmetric(TreeNode root) {
        invert(root.right);
        return isSame(root.left , root.right);
    }
}