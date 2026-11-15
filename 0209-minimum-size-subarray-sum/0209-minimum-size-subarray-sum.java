class Solution {
    public int minSubArrayLen(int tar, int[] arr) {
        int left =0 , sum=0, minLen = Integer.MAX_VALUE;
       for(int right = 0 ;right<arr.length;right++){
        sum+=arr[right];
        while(sum>=tar){
            minLen= Math.min(minLen,right-left+1);
            sum-=arr[left];
            left++;
        }
       }
        return minLen==Integer.MAX_VALUE? 0 : minLen;
    }
}