import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String s = br.readLine();
            int x;
            if (s.startsWith("push")){
                x = Integer.parseInt(s.split(" ")[1]);
                if (s.startsWith("push_f")){
                    dq.offerFirst(x);
                } else {
                    dq.offerLast(x);
                }
            } else if (s.startsWith("pop")){
                if (dq.isEmpty()){
                    sb.append(-1).append('\n');
                } else {
                    if (s.startsWith("pop_f")){
                        x = dq.pollFirst();
                    } else {
                        x = dq.pollLast();
                    }
                    sb.append(x).append('\n');
                }
            } else if (s.equals("size")){
                x = dq.size();
                sb.append(x).append('\n');
            } else if (s.equals("empty")){
                x = dq.isEmpty() ? 1 : 0;
                sb.append(x).append('\n');
            } else if (s.equals("front")){
                x = dq.isEmpty() ? -1 : dq.peekFirst();
                sb.append(x).append('\n');
            } else if (s.equals("back")){
                x = dq.isEmpty() ? -1 : dq.peekLast();
                sb.append(x).append('\n');
            }
        }
        System.out.print(sb);
    }
}