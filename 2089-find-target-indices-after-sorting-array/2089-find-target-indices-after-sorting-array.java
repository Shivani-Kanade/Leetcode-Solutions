class Solution {
    public List<Integer> targetIndices(int[] nums, int tar) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==tar) list.add(i);
            if(nums[i]>tar) break;
        }
        return list;
    }
}