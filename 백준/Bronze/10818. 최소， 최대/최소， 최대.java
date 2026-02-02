import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int count = input.nextInt();
  int[] array = new int[count];
     
  for (int i = 0; i < count; i++){
   array[i] = input.nextInt();
  }
  int max = array[0];
  int min = array[0];
     
  for (int a : array){
   if (max < a){
     max = a;
   }
   if (min > a){
    min = a;
   }
  }
  System.out.printf("%d %d", min, max);
                                       }
}