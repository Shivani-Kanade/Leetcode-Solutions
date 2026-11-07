class Solution {
    public String reverse(String s){
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return str.toString();
    }
    public int maximumNumberOfStringPairs(String[] w) {
        HashSet<String> set = new HashSet<>();
        int count=0;
        for(int i=0;i<w.length;i++){
            String rev = reverse(w[i]);
            if(set.contains(rev)) count+=1;
            else set.add(w[i]);
        }
        return count;
    }
}