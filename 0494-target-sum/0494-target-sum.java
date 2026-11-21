class Solution {
    public int ways(int i , int[] arr , int tar){
        if(i==arr.length){
            if(tar==0) return 1;
            else return 0;
        }
        int add = ways(i+1 , arr , tar-arr[i]);
        int sub = ways(i+1 , arr , tar+arr[i]);
        return add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        // int[][] dp = new int[nums.length][target+1];
        return ways(0,nums,target);

    }
}