import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String str = br.readLine();
            boolean isVaild = true;
            Deque<Character> stack = new ArrayDeque<>();
            
            for (char c : str.toCharArray()){
                if (c == '('){
                    stack.push(c);
                } else if (c == ')'){
                    if (stack.isEmpty()){
                        isVaild = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (!stack.isEmpty()){
                isVaild = false;
            } 
            if (isVaild){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}