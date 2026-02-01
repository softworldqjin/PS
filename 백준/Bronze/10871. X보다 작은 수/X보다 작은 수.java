import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] inputArray = new int[count];
        
        int key = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < inputArray.length; i++){
            inputArray[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] < key){
                sb.append(inputArray[i]).append(" ");
            }
        }
        System.out.println(sb.toString());
       
    }
}