class Solution {
    public int[] twoSum(int[] nums, int tar) {
        // length of array is n 
        int n = nums.length;
    // for storing the element with its index 
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            int sub = tar - nums[i];
            if(hm.containsKey(sub)){
                return new int[] {hm.get(sub),i};
            }
            hm.put(nums[i] ,i);
        }
        return new int[] {-1,-1};
    }
}