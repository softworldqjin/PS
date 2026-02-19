import java.util.Scanner;

public class Main{
    public static class Stack{
        public int[] stk = new int[10000];
        public int num;
        public int top;
        
        public Stack(){
            num = 0;
            top = -1;
        }
        
        public void push(int x){
            stk[++top] = x;
            num++;
        }
        
        public int pop(){
            if (empty()){
                return -1;
            }
            num--;
            return stk[top--];
        }
        
        public int size(){
            return num;
        }
        
        public boolean empty(){
            if (num <= 0){
                return true;
            }
            return false;
        }
        
        public int top(){
            if (num <= 0){
                return -1;
            }
            return stk[top];
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Stack stack = new Stack();
        
        for (int i = 0; i < count; i++){
            String str = sc.next();
            int x;
            
            switch (str){
                case "push":
                    x = sc.nextInt();
                    stack.push(x);
                    break;
                    
                case "pop":
                    x = stack.pop();
                    System.out.println(x);
                    break;
                    
                case "size":
                    x = stack.size();
                    System.out.println(x);
                    break;
                    
                case "empty":
                    if (stack.empty()){
                        x = 1;
                    } else {
                        x = 0;
                    }
                    System.out.println(x);
                    break;
                    
                case "top":
                    x = stack.top();
                    System.out.println(x);
                    break;
                                    
            }
        }
    }
}