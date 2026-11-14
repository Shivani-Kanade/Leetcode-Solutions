 class Solution {
     public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
               nums[i] += nums[i-1];
        }
        int[] ans = new int[m];
        for(int k=0;k<m;k++){
            int i=0,j=n-1;
            while(i<=j){
                int mid =i+(j-i)/2;
                if(nums[mid]>queries[k]) j=mid-1;
                 else{
                    ans[k]= Math.max(ans[k],mid+1);
                    i= mid+1;
         } }   }
         return ans;
    }

}