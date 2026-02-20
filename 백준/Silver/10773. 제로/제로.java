import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        for (int i = 0; i < count; i++){
            int x = sc.nextInt();
            if (x == 0){
                stack.pop();
            } else {
                stack.push(x);
            }
            
        }
        int sum = 0;
        for (Integer i : stack){
            sum += i;
        }
        
        System.out.println(sum);
    }
}