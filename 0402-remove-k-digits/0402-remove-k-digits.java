class Solution {
    public String removeKdigits(String num, int k) {
        //Using Stack
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(char t : num.toCharArray()){
            // this loop runs until our peek element is greater than our current string element
             while(k>0 && !st.isEmpty() && st.peek()>t)
                   {st.pop();
                   k--;}
                st.push(t);
             }
            //  if k is still remained then we remove elements from top
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        //  copying element of stack into stringbuilder
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        // Reversing The array
        str.reverse();
        int idx =0;
        // if there are leading zeroes than we remove them
        while(idx<str.length() && str.charAt(idx)=='0'){
            idx++;
        }
     
      String  result = str.substring(idx);
      if(result.length()==0) return "0";
      else
       return result;
    }
}