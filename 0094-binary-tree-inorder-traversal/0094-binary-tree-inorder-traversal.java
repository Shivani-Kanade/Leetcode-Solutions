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
    public  void inorder(TreeNode root,List<Integer> ans){
    //    if root is null return
       if(root == null) return;
    //   call for left subtree
        inorder(root.left,ans);
    //   adding value into ans
        ans.add(root.val);
    //   call for right subtree
        inorder(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root , ans);
        return ans;
    }
}