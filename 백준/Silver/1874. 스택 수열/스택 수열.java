import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        int cnt = 1;
        
        for (int i = 0; i < n; i++){
            int t = Integer.parseInt(br.readLine());
            
            while (cnt <= t){
                stack.push(cnt++);
                sb.append("+\n");
            }
            
            if (stack.peek() != t){
                System.out.println("NO");
                return;
            }
            
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}