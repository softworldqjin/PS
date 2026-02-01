import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        
        int key = scanner.nextInt();
   
        int num = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == key){
                num++;
            }
        }
        System.out.println(num);
    }
}