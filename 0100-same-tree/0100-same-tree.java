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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // if both are null return true
        if(p == null && q== null) return true;
        //  if one of them are null return false
        if(p==null || q==null) return false;
        //  if the values gets different return false
        if(p.val != q.val) return false;
        // if left subtree of both trees are not matched return false
        if(!isSameTree(p.left,q.left)) return false;
        // same if right subtree value not matched return false
        if(!isSameTree(p.right , q.right)) return false;
        return true;
    }
}