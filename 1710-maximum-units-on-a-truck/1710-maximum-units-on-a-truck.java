class Solution {
    public int maximumUnits(int[][] box, int truckSize) {
        Arrays.sort(box ,(a1,a2 )-> a2[1]-a1[1]);
        int sum=0;
        for(int i=0;i<box.length;i++){
            int nob = box[i][0];
            int nou = box[i][1];
            int min = Math.min(nob,truckSize);
            truckSize -= min;
            sum+=nou*min;
            if(truckSize==0) return sum;
        }
        return sum;
    }
}