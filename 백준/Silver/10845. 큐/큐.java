import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++){
            String s = br.readLine();
            String option = s.split(" ")[0];
            
            Integer x;
            if ("push".equals(option)){
                x = Integer.parseInt(s.split(" ")[1]);
                q.offer(x);
            } else if ("pop".equals(option)){
                x = q.poll();
                if (x == null){
                    x = -1;
                }
                sb.append(x).append('\n');
            } else if ("size".equals(option)){
                x = q.size();
                sb.append(x).append('\n');
            } else if ("empty".equals(option)){
                if (q.isEmpty()){
                    x = 1;
                } else {
                    x = 0;
                }
                sb.append(x).append('\n');
            } else if ("front".equals(option)){
                x = q.peekFirst();
                if (x == null){
                    x = -1;
                }
                sb.append(x).append('\n');
            } else if ("back".equals(option)){
                x = q.peekLast();
                if (x == null){
                    x = -1;
                }
                sb.append(x).append('\n');
            }
        }
        System.out.println(sb);
    }
}