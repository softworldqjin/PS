import java.util.Scanner;

public class Main{
public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    int index = scanner.nextInt();
    
    char c = str.charAt(index-1);
    System.out.println(c);
}}