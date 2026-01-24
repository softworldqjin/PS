import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        
        int[] array = new int[count];
        for (int i = 0; i < count; i++){
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            array[i] = n1 + n2;
        }
        for (int a : array){
            System.out.println(a);
        }
    }
}