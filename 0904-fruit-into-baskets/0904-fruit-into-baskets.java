class Solution {
    public int totalFruit(int[] f) {
        int n = f.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0,j=0,maxLen =0 , len =0;
        while(j<n){
           if(!map.containsKey(f[j])){
            map.put(f[j],1);
           }
           else{
            map.put(f[j] , map.get(f[j])+1);
           }
           while(map.size()>2){
              int freq = map.get(f[i]);
              if(freq==1) map.remove(f[i]);
              else map.put(f[i],freq-1);
              i++;
           }
           len = j-i+1;
           maxLen = Math.max(maxLen,len);
           j++;
        }
        return maxLen;
    }
}