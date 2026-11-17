class Solution {
    public int maxSatisfied(int[] c, int[] g, int m) {
        int n = c.length;
        int i =0 , j=m-1,st=0,en=0;
        int unsatisfied = 0 , maxUnsatisfied=-1;
        int a=i , b=j;
        for(int k =i;k<=j;k++){
            if(g[i]==1)unsatisfied+=c[i];
        }
       while(j<n){
        if( maxUnsatisfied<unsatisfied){
             maxUnsatisfied = unsatisfied;
             a=i;b=j;
        }
        i++;j++;
        if(j<n && g[j]==1) unsatisfied+=c[j];
        if(g[i-1]==1) unsatisfied-=c[i-1];
       }
        for(int k =a;k<=b;k++){
            g[k]=0;     
        }
        int ans =0;
        for(i=0;i<n;i++) {
            if(g[i]==0)ans+=c[i];
        }
        return ans;
    }
}