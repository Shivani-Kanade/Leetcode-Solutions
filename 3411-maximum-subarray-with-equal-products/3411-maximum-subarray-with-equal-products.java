class Solution {
    public int gcd(int a  , int b){
        return b ==0 ? a : gcd(b,a%b);
    }
    public int maxLength(int[] nums) {
        int best = 2 , left =0 , pr=1;
        for(int r =0;r<nums.length;r++){
            int x = nums[r];
            while(gcd(pr,x)>1) pr/=nums[left++];
            pr*=x;
            best = Math.max(best,r-left+1);
        }
        return best;
    }
}