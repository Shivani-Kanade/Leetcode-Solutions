class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            int freq = map.getOrDefault(num ,0);
            map.put(num,freq+1);
        }
        Queue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a) - map.get(b));
        for(int key : map.keySet()){
            pq.add(key);
            if(k<pq.size()) pq.poll();
        }
        int[] ans = new int[k];
        int idx=0;
        while(!pq.isEmpty()){
            
            ans[idx++] = pq.poll();
        }
        return ans;


    }
}