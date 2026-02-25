import java.util.*;

public class Main{
    public static void main(String[] args){
        Deque<Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String option = sc.next();
            
            Integer x;
            switch(option){
                case "push":
                    x = sc.nextInt();
                    queue.offer(x);
                    break;
                    
                case "pop":
                    x = queue.poll();
                    if (x == null){
                        x = -1;
                    }
                    System.out.println(x);
                    break;
                    
                case "size":
                    x = queue.size();
                    System.out.println(x);
                    break;
                
                case "empty":
                    if (queue.isEmpty()){
                        x = 1;
                    } else {
                        x = 0;
                    }
                    System.out.println(x);
                    break;
                    
                case "front":
                    x = queue.peekFirst();
                    if (x == null){
                        x = -1;
                    }
                    System.out.println(x);
                    break;
                
                case "back":
                    x = queue.peekLast();
                    if (x == null){
                        x = -1;
                    }
                    System.out.println(x);
                    break;
            }
        }
    }
}