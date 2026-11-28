class Solution {
    public int findLongestChain(int[][] points) {
         Arrays.sort(points,
            (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 0;
        long curr = Integer.MIN_VALUE; //bas ye dhyaan rakhna
      for(int[] p : points){
        if(p[0]>curr){
               curr = p[1];
               arrows++;
        }

      }
        

        return arrows;
    }
}