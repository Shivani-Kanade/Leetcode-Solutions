class Solution {
    public void backtrack(List<List<Integer>> result , List<Integer> ans  ,int i ,   int n , int k ){
        if(ans.size()==k){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int m = i ; m<=n;m++){
            ans.add(m);
            backtrack(result,ans,m+1,n,k);
            ans.remove(ans.size()-1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result , new ArrayList<>(),1,n,k);
        return result;
    }
}