import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++){
            String s = br.readLine();
            Deque<Character> stack = new ArrayDeque<>();
            
            for (char c : s.toCharArray()){
                if (stack.isEmpty()){
                    stack.push(c);
                } else if (stack.peek() == c){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()){
                count++;
            }
        }
        System.out.println(count);
    }
}