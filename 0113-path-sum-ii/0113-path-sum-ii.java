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
    public List<Integer> copy(List<Integer> arr){
        List<Integer> list = new ArrayList<>();
        for(int x : arr){
            list.add(x);
        }
        return list;
    }
    public void find(TreeNode root, List<List<Integer>> ans, List<Integer> list, int tar){
        if(root==null) return ;
        if (root.left==null && root.right==null) {
            if(root.val==tar){ list.add(root.val);
            ans.add(list);
            return;
        }
        }
       list.add(root.val);
       List<Integer> list1 = copy(list);
       List<Integer> list2 = copy (list);
       find(root.left , ans ,list1, tar-root.val );
       find(root.right , ans ,list2, tar-root.val );

    }
    public List<List<Integer>> pathSum(TreeNode root, int tar) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list =  new ArrayList<>();
         find(root , ans , list,tar);
         return ans;
    }
}