import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        
        for (char c = 'a'; c <= 'z'; c++){
            int index = -1;
            for (int i = 0; i < str.length(); i++){
                if (c == str.charAt(i)){
                    index = i;
                    break;
                }
            }
            System.out.print(index + " ");
        }
    }
}