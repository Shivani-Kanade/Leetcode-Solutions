class Solution {
    public int minMoves(int[] nums) {
      int min = Integer.MAX_VALUE;
        for (int x : nums) min = Math.min(min,x);
        long moves = 0;
        for(int i :nums) moves+= i-min;
        return (int)moves;
    }
}