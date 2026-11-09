class Solution {
    private int rev(int num){
        int ans = 0;
        while(num!=0){
            ans = ans*10 +(num%10);
            num/=10;
        }
        return ans;
    }
    public int countNicePairs(int[] nums) {
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length ;i++){
            int rem = nums[i] - rev(nums[i]);
            if(map.containsKey(rem)){
                count+= map.get(rem);
                count %= 1000000007;
                map.put(rem , map.get(rem)+1);
            }
            else map.put(rem,1);
        }
        return count;
    }
}