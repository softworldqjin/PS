import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] x = new int[num];
        
        for (int i = 0; i < num; i++){
            x[i] = sc.nextInt();
        }
        
        int count = 0;
        int i = 1;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        while (true){
            if (i == 1){
                stack.push(i++);
                sb.append("+").append("\n");
            } else {
                if (stack.empty()){
                    if (i == num + 1){
                        break;
                    }
                    stack.push(i++);
                    sb.append("+").append("\n");
                } else {
                    if (stack.peek() == x[count]){
                        if (count == num){
                            break;
                        }
                        stack.pop();
                        count++;
                        sb.append("-").append("\n");
                    } else {
                        if (i == num + 1){
                            break;
                        }
                        stack.push(i++);
                        sb.append("+").append("\n");
                    }
                }
            }
        }
        
        if (stack.empty()){
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}