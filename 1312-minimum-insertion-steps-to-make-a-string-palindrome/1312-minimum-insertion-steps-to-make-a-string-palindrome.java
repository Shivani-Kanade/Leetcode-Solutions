class Solution {
    public int minInsertions(String s) {
        return s.length() - longestPalindromeSubseq(s);
    }
     public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] memo = new int[len][len];
        return ps(s, 0, len-1, memo);
    }

    int ps(String s, int l, int r, int[][] memo) {
        if (memo[l][r] != 0) return memo[l][r];
        if (l == r) return 1;
        if (l > r) return 0;
        
        if (s.charAt(l) == s.charAt(r)) {
            memo[l][r] = 2 + ps(s, l+1, r-1, memo);
        } else {
            memo[l][r] = Math.max(ps(s, l+1, r, memo), ps(s, l, r-1, memo));
        }
        return memo[l][r];
    }

}
