
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       Queue<Integer> pq= new PriorityQueue<>();
       for(int i=0;i<arr.length;i++){
          if(k>0){
            pq.add(arr[i]);
            k--;
          }
          else if(Math.abs(pq.peek()-x)>Math.abs(arr[i]-x)){
            pq.poll();
            pq.add(arr[i]);
          }
       }
       List<Integer> ans = new ArrayList<>();
       while(!pq.isEmpty()) ans.add(pq.remove());
       return ans;
    }
}