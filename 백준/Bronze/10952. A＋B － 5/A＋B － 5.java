import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int count = 0;
        
        while (true){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if (num1 == 0 && num2 == 0){
                break;
            }
            int sum = num1 + num2;
            array[count++] = sum;
        }
        
        for (int i = 0; i < count; i++){
            System.out.println(array[i]);
        }
    }
}