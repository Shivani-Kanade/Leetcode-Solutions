class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int i=0,j=k-1;
        int sum =0 , c=0;
        for(int a=0;a<k;a++){
            sum+=arr[a];
        }
        if(sum/k>=t) c++;
        i++;j++;
        while(j<arr.length){
            sum = sum - arr[i-1]+arr[j];
            if(sum/k>=t)c++;
            i++;j++;
        }
        return c;
    }
}