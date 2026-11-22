class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] charArray1 = s.toCharArray();
        StringBuilder st = new StringBuilder(s);
        char[] charArray2 = st.reverse().toString().toCharArray();
        int n = charArray1.length;
        int m = charArray2.length;
        int [][]dp = new int [n][m];
        for(int [] row : dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0,charArray1,charArray2,dp);
    }
    static int solve(int i , int j,char [] s1,char[]s2,int [][]dp){
        if(i==s1.length||j==s2.length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1[i]==s2[j]){
            return 1 + solve(i+1,j+1, s1,s2,dp);
        }
        
        int choice1 = solve(i+1,j,s1,s2,dp);
        int choice2 = solve(i,j+1,s1,s2,dp);
        dp[i][j] = Math.max(choice1,choice2);

        return dp[i][j];
    }
}