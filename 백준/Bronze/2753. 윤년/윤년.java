import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int option;
        int year = input.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            option = 1;
        } else {
            option = 0;
        }
        
        System.out.println(option);
    }
}