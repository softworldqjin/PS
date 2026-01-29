import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[][] nums = new int[num][3];
        
        for (int i = 0; i < nums.length; i++){
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            int sum = n1 + n2;
            nums[i][0] = n1;
            nums[i][1] = n2;
            nums[i][2] = sum;
        }
        
        for (int i = 0; i < nums.length; i++){
            System.out.printf("Case #%d: %d + %d = %d\n", (i+1), nums[i][0], nums[i][1],nums[i][2]);
            
        }
        
            
    }
}