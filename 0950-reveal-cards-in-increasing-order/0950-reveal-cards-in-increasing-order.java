class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);
       int n = deck.length;
        int[] res = new int[n];
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<n;i++) que.add(i);
        for(int i=0;i<n;i++){
            res[que.poll()] = deck[i];
            que.add(que.poll());
        }
        
        return res;
    }
}