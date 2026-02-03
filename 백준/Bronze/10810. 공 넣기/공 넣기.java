import java.util.Scanner;

public class Main{
public static void main(String[] args){


    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();

    int[] x = new int[num];
    int count = scanner.nextInt();
    for (int i = 0; i < count; i++){ 
     int start = scanner.nextInt();
     int end = scanner.nextInt();
     int ballNum = scanner.nextInt();
     
     for (int j = start-1; j <= end-1; j++){
      x[j] = ballNum;
     }
    }
    for (int a : x){
     System.out.print(a + " ");}

}

    
}