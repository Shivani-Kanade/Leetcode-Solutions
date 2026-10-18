class Solution {
    public boolean isPalindrome(int x) {
        //  approach 1 by converting int into string 
       String s = String.valueOf(x);
       int i=0,j=s.length()-1;
      while(i<=j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        i++;j--;
      }
      return true;
    }
    /* 
    Second approach 
     if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }*/
}
