import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] numbers = new int[num];
        
        for (int i = 0; i < num; i++){
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            numbers[i] = n1 + n2;
        }
        for (int i = 0; i < num; i++){
            System.out.printf("Case #%d: %d\n", (i+1), numbers[i]);
        }
    }
}