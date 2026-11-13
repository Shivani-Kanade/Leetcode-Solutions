class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] arr = new long[nums.length];
        int maxi = nums[0];
        for(int i=0;i<n;i++){
            maxi = Math.max(nums[i],maxi);
            arr[i]+=maxi+nums[i];
            if(i>0) arr[i]+=arr[i-1];
        }
        return arr;
    }
}