class Solution {
    public String predictPartyVictory(String s) {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        int n = s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                r.add(i);
            }
            else d.add(i);;
        }
        while(!r.isEmpty() && !d.isEmpty()){
            if(r.peek() < d.peek())
                r.add(n++);
            else
                d.add(n++);
            
            d.poll();
            r.poll();   
        }
        return r.isEmpty()? "Dire" : "Radiant" ;
    }
}