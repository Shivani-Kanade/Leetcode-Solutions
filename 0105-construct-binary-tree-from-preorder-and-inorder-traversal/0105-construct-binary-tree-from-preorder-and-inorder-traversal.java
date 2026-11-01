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
     public TreeNode helper(int[] preorder, int[] inorder , int prelow , int prehig , int inlow , int inhig){
        if(prelow>prehig || inlow>inhig) return null;
        TreeNode root  = new TreeNode(preorder[prelow]);
        int r=0;
        while(preorder[prelow]!= inorder[r]) r++;
        int ls = r-inlow;
        root.left = helper(preorder , inorder , prelow+1, prelow+ls , inlow , r-1);
        root.right = helper(preorder , inorder , prelow+ls+1, prehig ,   r+1, inhig);
        return root;
     } 
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder , inorder , 0 , n-1 , 0 , n-1);
    }
}