import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}