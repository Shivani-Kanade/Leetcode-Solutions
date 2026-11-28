class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points  , (a,b)-> Integer.compare(a[0],b[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        for(int[] point : points){
         if(ans.size()==0 || ans.get(ans.size()-1)[1]<point[0]){
                ans.add(point);
         }
        //  if(ans.size()==0 || ans.get(ans.size()-1)[1]>oint[0]){
        //         ans.add(point);
        //  }
         else {
            int st = Math.max(ans.get(ans.size()-1)[0] , point[0]);
            int end = Math.min(ans.get(ans.size()-1)[1] , point[1]);
            ans.set(ans.size()-1 , new int[]{st,end});
         }
        }
        return ans.size();
    }
}