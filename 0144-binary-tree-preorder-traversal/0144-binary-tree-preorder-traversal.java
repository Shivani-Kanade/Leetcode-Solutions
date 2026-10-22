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
     List<Integer> ans;
     public  void preorder(TreeNode root , List<Integer> ans){
        //  if root is null then return from the method
         if(root == null) return;
        // adding value in list
         ans.add(root.val);
        // calling recursive method for left subtree
        preorder(root.left,ans);
        // calling recursive method for right subtree
        preorder(root.right,ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        // calling the preorder method
        preorder(root , ans);
        //returning the ans;
        return ans;


    }
}