class Solution {
    public int numRescueBoats(int[] p, int limit) {
        int boat =0;
        Arrays.sort(p);
       int i=0, j=p.length-1;
       while(i<=j){
        if(p[i]+ p[j]<=limit){
            j--;
            i++;
        }
        else j--;
        boat++;
        }
       
             
        return boat;
    }
}