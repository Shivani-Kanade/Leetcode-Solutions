class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       
        int n = nums.length;
        if(n == 0 || k<=0) return new int[0];
         Deque<Integer> que = new ArrayDeque<>();
        // int maximum_no = Integer.INT_MIN; 
        int[] res = new int[n-k+1];
        int res_idx=0;
        for(int i=0;i<n;++i){
             while(!que.isEmpty() && que.peek()<i-k+1) // remove out of windows element
            {
                 que.pollFirst();
            }
            // remove smaller elements from right side
            while(!que.isEmpty() && nums[que.peekLast()]<nums[i]){
             que.pollLast();
            }
            que.offerLast(i);
            if(i >= k-1){
                res[i-k+1] = nums[que.peek()];
            }
        }
        return res;
    }
}