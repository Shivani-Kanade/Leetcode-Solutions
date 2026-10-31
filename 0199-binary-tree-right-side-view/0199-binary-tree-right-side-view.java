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
    public int levels(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left) , levels(root.right));
    }
    public void preorder(TreeNode root , int levels , List<Integer> ans ){
        if(root==null) return ;
        ans.set(levels,root.val);
        preorder(root.left, levels+1,ans);
        preorder(root.right,levels+1,ans);
    }

    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
         int n = levels(root);
         for(int i=0;i<n;i++)  ans.add(0);
         preorder(root ,0,ans);
         return ans ; 
    }
}