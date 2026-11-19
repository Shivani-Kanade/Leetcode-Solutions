class Solution {
    public int maze(int r , int c , int[][] dp , Integer m , Integer n){
         if(r>=m || c>=n) return 0;
         if(r==m-1 || c==n-1) return 1;
         if(dp[r][c]!=0) return dp[r][c];
         return dp[r][c] = maze(r+1,c,dp,m,n)+maze(r,c+1,dp,m,n);
        
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        int ans = maze(0,0,dp,m,n);
        return ans;
    }
}