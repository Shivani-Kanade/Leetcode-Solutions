class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] frq = new int[k];
        for(int num : arr){
            int rem = num%k;
            if(rem<0) rem+=k;
            frq[rem]++;
        }
        if(frq[0]%2!=0) return false;
        for(int i=1;i<=k/2;i++){
            if(frq[i] != frq[k-i]) return false;
        }
        return true;
    }
}