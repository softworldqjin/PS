import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int totalCount = scanner.nextInt();
        
        for (int i = 0; i < totalCount; i++){
            int count = scanner.nextInt();
            String str = scanner.next();
            
            for (int j = 0; j < str.length(); j++){
                for (int k = 0; k < count; k++){
                    result.append(str.charAt(j));
                }
                if (j == (str.length() - 1)){
                    result.append("\n");
                }
            }
        }
        System.out.println(result);
    }
}