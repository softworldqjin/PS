import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.next();
        String n2 = scanner.next();
        
        StringBuilder reverseN1 = new StringBuilder();
        String strN1 = reverseN1.append(n1).reverse().toString();
        int intValueN1 = Integer.parseInt(strN1);
        
        StringBuilder reverseN2 = new StringBuilder();
        String strN2 = reverseN2.append(n2).reverse().toString();
        int intValueN2 = Integer.parseInt(strN2);
        
        System.out.println((intValueN1 > intValueN2) ? intValueN1 : intValueN2);
        
        
        
        
        
    }
}