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
    public TreeNode helper( ArrayList<Integer>  arr ,int lo , int hi){
        if(lo>hi || hi>=arr.size()) return null;
        int mid = lo+ (hi-lo)/2;
    TreeNode node = new TreeNode(arr.get(mid));
       node.left =  helper(arr , lo , mid-1);
       node.right = helper(arr , mid+1,hi);
       return node;
    }
   ArrayList<Integer> list = new ArrayList<Integer>();
   public void inorder(TreeNode root , ArrayList<Integer> list){
      if(root==null) return;
      inorder(root.left,list);
      list.add(root.val);
      inorder(root.right,list);
   }
    
    public TreeNode balanceBST(TreeNode root) {
        list = new ArrayList<>();
        inorder(root,list);
        return helper(list , 0 , list.size() -1);
    }
}