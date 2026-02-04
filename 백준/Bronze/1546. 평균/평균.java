import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] scores = new int[count];
        
        for (int i = 0; i < count; i++){
            scores[i] = scanner.nextInt();
        }
        
        int max = scores[0];
        for (int i = 1; i < count; i++){
            if (max < scores[i]){
                max = scores[i];
            }
        }
       double sum = 0;
       for (int score : scores){
           sum += (double) score / max * 100;
       }
       
       double average = sum / count;
       System.out.println(average);
    }
}