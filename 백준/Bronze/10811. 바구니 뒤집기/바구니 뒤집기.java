import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int basketCount = scanner.nextInt();
        
        int[] baskets = new int[basketCount];
        for (int i = 0; i < baskets.length; i++){
            baskets[i] = i + 1;
        }
        
        int tryCount = scanner.nextInt();
        for (int i = 0; i < tryCount; i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            
            int replaceCount = (end - (start - 1)) / 2;
            for (int j = 0; j < replaceCount; j++){
                
                int temp = baskets[start - 1];
                baskets[start - 1] = baskets[end - 1];
                baskets[end - 1] = temp;
                
                start++;
                end--;
            }
        }
        
        for (int basket : baskets){
            System.out.printf("%d ", basket);
        }
        
    }
}