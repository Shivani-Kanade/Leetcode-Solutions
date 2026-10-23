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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Deque<TreeNode> que = new LinkedList<>();
        que.addFirst(root);
        boolean reverse = false;
        while(!que.isEmpty()){
            int size = que.size();
            List<Integer> lvl = new ArrayList<>();
            for(int i=0;i<size;i++){
                if(!reverse){
                TreeNode curr = que.pollFirst();
                lvl.add(curr.val);
                if(curr.left!=null) que.addLast(curr.left);
                if(curr.right!=null) que.addLast(curr.right);
                }
                
                else{
                TreeNode curr = que.pollLast();
                lvl.add(curr.val);
                if(curr.right!=null) que.addFirst(curr.right);
                if(curr.left!=null) que.addFirst(curr.left);
                }
            }
            reverse = !reverse;
            ans.add(lvl);
        }
        return ans;

    }
}