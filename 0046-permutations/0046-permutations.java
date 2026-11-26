class Solution {
     public  void backtrack(List<List<Integer>> result , List<Integer> per , int[] arr){
              if(per.size() == arr.length){
                result.add(new ArrayList<>(per));
                return;
              }
              for(int i=0;i<arr.length;i++){
                if(per.contains(arr[i])) continue;
                per.add(arr[i]);
                backtrack(result,per,arr);
                per.remove(per.size()-1);
              }
     }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
         backtrack(result, new ArrayList<Integer>() , nums );
        return result;
    }
}