import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a * b * c;
        
        StringBuilder sb = new StringBuilder();
        sb.append(result);
        int[] array = new int[10];
        
        for (int i = 0; i < sb.length(); i++){
            int x = Integer.parseInt(String.valueOf(sb.charAt(i)));
            array[x] += 1;
        }
        
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}