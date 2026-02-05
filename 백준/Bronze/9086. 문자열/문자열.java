import java.util.Scanner;

public class Main{
public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++){
     String str = scanner.next();
     char first = str.charAt(0);
     char end = str.charAt(str.length() - 1);
     sb.append(first).append(end).append("\n");
}
    
    System.out.println(sb);
}
}