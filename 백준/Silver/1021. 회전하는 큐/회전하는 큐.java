import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int n = sc.nextInt();
        LinkedList<Integer> q = new LinkedList<>();
        
        for (int i = 1; i < length + 1; i++){
            q.addLast(i);
        }
        
        int count = 0;
        for (int i = 0; i < n; i++){
            int t = sc.nextInt();
            int front = q.indexOf(t);
            int last = q.size() - front;
            
            if (front >= last){
                for (int j = 0; j < last; j++){
                    q.addFirst(q.pollLast());
                    count++;
                }
            } else {
                for (int j = 0; j < front; j++){
                    q.addLast(q.pollFirst());
                    count++;
                }
            }
            q.pollFirst();
        }
        System.out.println(count);
    }
}