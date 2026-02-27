import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deque<Integer> q = new ArrayDeque<>();
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++){
            q.offer(i);
        }
        
        if (q.size() == 1){
            System.out.println(q.peek());
            return;
        }
        
        while (true){
            q.poll();
            if (q.size() == 1){
                System.out.println(q.peek());
                break;
            }
            int front = q.poll();
            q.offerLast(front);
            }
            
        
    }
}