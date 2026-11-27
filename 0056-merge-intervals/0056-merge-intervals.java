class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter , (a1,a2)-> a1[0] - a2[0]);
       List<int[]> merged = new ArrayList<>();
       int[] prev =inter[0];
       for(int i=1;i<inter.length;i++){
            if(inter[i][0]<=prev[1]){
                prev[1] = Math.max(prev[1],inter[i][1]);
            }
            else{
                merged.add(prev);
                prev = inter[i];
            }
       }
       merged.add(prev);
       return merged.toArray(new int[merged.size()][]);
        
    }
}