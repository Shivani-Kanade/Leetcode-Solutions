class Solution {
    public int numRabbits(int[] num) {
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num.length;i++){
            map.put(num[i]+1 , map.getOrDefault(num[i]+1 , 0)+1);
        }
        for( int key : map.keySet()){
            int val = map.get(key);
            int q = val/key;
            int r = val%key;
            ans+=q*key;
            if(r!=0)  ans+=key;
        }
        return ans;

    }
}