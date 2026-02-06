import java.util.Scanner;

public class Main{
public static void main(String[] args){


    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    StringBuilder sb = new StringBuilder(count);
    
    int sum = 0;
    String num = scanner.next();
    sb.append(num);
    
    for (int i = 0; i < sb.length(); i++){
     int n1 = Integer.parseInt(String.valueOf(sb.charAt(i)));
     sum += n1;
}
    System.out.println(sum);
}
}

