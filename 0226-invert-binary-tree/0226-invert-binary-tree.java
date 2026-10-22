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
     public  void invert(TreeNode root){
        // if root is null or root is leaf node tehn return
        if(root==null || (root.left==null && root.right==null)) return;
        // swapping left node to right and right to left
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        // recursive call for left and right subtree
        invert(root.left);
        invert(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}