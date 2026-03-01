import java.util.*;

public class Main{
    public static void main(String[] args){
        LinkedList<Integer> dq = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++){
            dq.addLast(i);
        }
        
        int count = 0;
        for (int i = 0; i < m; i++){
            int t = sc.nextInt();
            
            int front = dq.indexOf(t);
            int last = dq.size() - front;
            if (front >= last){
                for (int j = 0; j < last; j++){
                    dq.addFirst(dq.pollLast());
                    count++;
                }
            } else {
                for (int j = 0; j < front; j++){
                    dq.addLast(dq.pollFirst());
                    count++;
                }
            }
            
            dq.pollFirst();
        }
        System.out.println(count);
    }
}