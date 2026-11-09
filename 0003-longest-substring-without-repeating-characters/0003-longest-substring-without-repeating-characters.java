class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        if(s.length()==2 && (s.charAt(0) != s.charAt(1))) return s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlength = -1;
        int i=0,j=0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                maxlength = Math.max(maxlength , j-i);
             while(s.charAt(i)!=ch) i++;
             i++;
            }  
             map.put(ch , j);
            
            j++;
        }
         maxlength = Math.max(maxlength , j-i);
           return maxlength;
    }
}