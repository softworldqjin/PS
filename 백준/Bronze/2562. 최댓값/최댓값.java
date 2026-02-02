import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  int[] array = new int[9];
    
  for (int i = 0; i < 9; i++){
   array[i] = scanner.nextInt();
}

  int max = array[0];
  int num = 0;
     
  for (int i = 1; i < array.length; i++){
   if (max < array[i]){
    max = array[i];
    num = i;
 }
}
  System.out.println(max);
  System.out.println(num+1);
}
}