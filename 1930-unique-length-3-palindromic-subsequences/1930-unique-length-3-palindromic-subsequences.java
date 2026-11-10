class Solution {
    public int countPalindromicSubsequence(String s) {
        Map<Character ,Integer> fmap = new HashMap<>();
         Map<Character ,Integer> lmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!fmap.containsKey(c)) fmap.put(c,i);
           lmap.put(c,i);
        }
        int count =0;
        for(char key : fmap.keySet()){
            int fidx = fmap.get(key);
            int lidx = lmap.get(key);
            Set<Character> set = new HashSet<>();
            for(int i=fidx+1 ; i<lidx;i++){
                  set.add(s.charAt(i));
            }
            count+=set.size();
        }
        return count;

    }
}