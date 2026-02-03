import java.util.Scanner;

public class Main{
public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int[] x = new int[num];
    
    for (int i = 0; i < x.length; i++){
     x[i] = i+1;
}
    int count = scanner.nextInt();
    for (int i = 0; i < count; i++){
     int n1 = scanner.nextInt();
     int n2 = scanner.nextInt();
     
     int temp = x[n1 - 1];
     x[n1 - 1] = x[n2 -1];
     x[n2 - 1] = temp;
}
    for (int a : x){
     System.out.print(a + " ");
}
}}