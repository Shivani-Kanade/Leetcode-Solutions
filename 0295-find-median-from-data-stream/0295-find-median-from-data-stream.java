class MedianFinder {
    PriorityQueue<Integer> minq;
     PriorityQueue<Integer> maxq;
    
    public MedianFinder() {
        minq = new PriorityQueue<>();
        maxq = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
       maxq.add(num);
       
            if(!maxq.isEmpty() && !minq.isEmpty() && maxq.peek()>minq.peek()) {
                minq.add(maxq.remove());
            }
        // Balance
        if(minq.size()>maxq.size()+1) {
            int top = minq.remove();
            maxq.add(top);
        }
         if(minq.size()+1 < maxq.size()+1) {
            int top = maxq.remove();
            minq.add(top);
        }

    }
    
    public double findMedian() {
       if(maxq.size()==minq.size()) return (maxq.peek()+ minq.peek())/2.0;
       else if(maxq.size()> minq.size()) return maxq.peek();
       else return minq.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */