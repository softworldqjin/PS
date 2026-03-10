import java.util.*;
import java.io.*;

public class Main{
    
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true){
            String str = br.readLine();
            if (str.equals(".")){
                break;
            }
            
            Deque<Character> stack = new ArrayDeque<>();
            boolean isValid = true;
            
            for (char c : str.toCharArray()){
                if (c == '(' || c == '['){
                    stack.push(c);
                }
                else if (c == ')'){
                    if (stack.isEmpty() || stack.peek() != '('){
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
                else if (c == ']'){
                    if (stack.isEmpty() || stack.peek() != '['){
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }

            }
            if (!stack.isEmpty()){
                isValid = false;
            }
            if (isValid){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}