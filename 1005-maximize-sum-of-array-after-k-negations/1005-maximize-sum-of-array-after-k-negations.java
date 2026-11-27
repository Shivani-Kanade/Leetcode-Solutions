class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int idx =0;
       while (k > 0 && idx < nums.length && nums[idx] < 0) {
            nums[idx] = -nums[idx];
            idx++;
            k--;
        }

        Arrays.sort(nums);

        if (k % 2 == 1) {
            nums[0] = -nums[0];
        }
        for( idx=0;idx<nums.length;idx++){
            sum+=nums[idx];
        }
        return sum;
    }
}