import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new ArrayDeque<>();
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String s = br.readLine();
            int x;
            
            if (s.startsWith("push")){
                x = Integer.parseInt(s.split(" ")[1]);
                q.offer(x);
            } else if (s.startsWith("pop")){
                x = q.isEmpty() ? -1 : q.poll();
                sb.append(x).append('\n');
                
            } else if (s.startsWith("size")){
                x = q.size();
                sb.append(x).append('\n');
                
            } else if (s.startsWith("empty")){
                x = q.isEmpty() ? 1 : 0;
                sb.append(x).append('\n');
                
            } else if (s.startsWith("front")){
                x = q.isEmpty() ? -1 : q.peekFirst();
                sb.append(x).append('\n');
                
            } else if (s.startsWith("back")){
                x = q.isEmpty() ? -1 : q.peekLast();
                sb.append(x).append('\n');
            } 
        }
        System.out.print(sb);
    }
}