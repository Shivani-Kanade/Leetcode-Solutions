class Solution {
    public long coin(int[] arr , int i , int C , long[][] dp ){
        if(i==arr.length) {
            if(C==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][C]!=-1) return dp[i][C];
        long skip = coin(arr,i+1,C,dp);
        if(C - arr[i]<0) return dp[i][C] = skip;
        long pick = 1 +coin(arr,i,C-arr[i],dp);
        return dp[i][C] = Math.min(pick,skip);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[n][amount+1];
        for(long[] row : dp ){
            Arrays.fill(row,-1);
        }
       long ans =  coin(coins,0,amount,dp);
       if(ans==Integer.MAX_VALUE) return -1;
       else return (int) ans;
    }
}