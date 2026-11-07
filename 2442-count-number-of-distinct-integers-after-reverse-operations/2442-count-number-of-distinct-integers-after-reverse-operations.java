class Solution {
    public int reverse(int n){
        int temp=n;
        int rev =0;
        while(temp!=0){
           rev = rev*10+(temp%10);
           temp/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
}