import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        
        int count = 0;
        
        for (int s : scoville) {
            q.add(s);
        }
        
        while (q.size() > 1 && q.peek() < K) {
            int no1 = q.poll();   
            int no2 = q.poll();  
        
            int mix = no1 + (no2 * 2);
            q.add(mix);
            
            count++;
        }
        
        if (q.peek() >= K) {
            return count;
        } else {
            return -1;
        }
    }
}