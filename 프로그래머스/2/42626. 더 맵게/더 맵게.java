import java.util.*;

class Solution {
    public int solution(int[] scoville, int k) {
        //  [1,2,3,4,5] [4,1,2,5] ,, 스코빌 지수 K 미만이면 음식을 섞어서 스코빌지수를 높이자.
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        // poll peek 제일 작은 것부터 뽑아주거나, 제일 작은거를 확인
        for (int a : scoville){
            q.add(a);
        }
        
        int count = 0;
        // 1 1 1 .. 1+(1*2) = 3,, [1,3],, 1 + (3 * 2) = 7.. K보다 작을때 return -1
        // 우선순위 큐에 들어간 스코빌 지수들,, 요소들이 k보다 작으면 음식섞어서 스코빌지수를 높이자
        while (q.size() > 1 && q.peek() < k){
            int no1 = q.poll();
            int no2 = q.poll();
            int mix = no1 + (no2 * 2);
            
            q.add(mix);
            count++;
        }
        
        // 우선순위 큐에 들어간 가장 작은 스코빌 확인, K보다 크면 return 섞은횟수, K보다 작으면 return -1
        if (q.peek() >= k){
            return count;
        } else {
            return -1;
        }
    }
}