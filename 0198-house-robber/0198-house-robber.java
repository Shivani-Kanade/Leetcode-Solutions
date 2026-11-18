class Solution {
    public int robo(int[] num , int i,int[] dp){
        if(i>=num.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take = num[i] + robo(num,i+2,dp);
        int skip = robo(num,i+1,dp);
        return dp[i] = Math.max(take,skip);
    }
    public int rob(int[] num) {
        if(num.length==2) return Math.max(num[0],num[1]);
        int[] dp = new int[num.length];
        Arrays.fill(dp,-1);
        return robo(num,0,dp);
    }



	
}