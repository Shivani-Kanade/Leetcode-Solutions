class Solution {
    public int bestClosingTime(String c) {
        int[] arr = new int[c.length()+1];
        arr[0]=0;
        for(int i=1;i<arr.length;i++){
                 if(c.charAt(i-1)=='N'){
                    arr[i]+=1;
                 }
                 arr[i]+=arr[i-1];
        }
        int y=0;
        for(int i=arr.length-2;i>=0;i--){
              if(c.charAt(i)=='Y')y+=1;
              arr[i] += y;
        }
        int mini = arr.length+10,minIdx=-1;
        for(int i=0;i<arr.length;i++) {
            if(mini>arr[i]){
                mini = arr[i];
                minIdx=i;
            }
        }
       
        return minIdx;
    }
}