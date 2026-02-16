import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int total = hour * 60 + min - 45;
        
        if (total < 0){
            total = 24 * 60 + min - 45;
        }
        int hour1 = total / 60 % 24;
        int min1 = total % 60;
        System.out.printf("%d %d", hour1, min1);
    }
}