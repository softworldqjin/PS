import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while (true){
            int n1;
            if (scanner.hasNextInt()){
                n1 = scanner.nextInt();
            } else {
                break;
            }
            int n2 = scanner.nextInt();
            sb.append(n1+n2).append("\n");   
        }
        System.out.println(sb.toString());
    }
}