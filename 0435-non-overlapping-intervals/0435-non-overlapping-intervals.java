class Solution {
    public int eraseOverlapIntervals(int[][] points) {
         Arrays.sort(points,
            (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 0;
        long lastEnd = points[0][1]; //bas ye dhyaan rakhna

        for (int i=1;i<points.length;i++) {

            if (points[i][0] < lastEnd)  arrows++;
               else  lastEnd = points[i][1];
            
        }

        return arrows;
    }
}