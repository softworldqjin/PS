import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        char[][] alphas = new char[][]{{'A','B','C'},{'D','E','F'},
                                       {'G','H','I'},{'J','K','L'},
                                       {'M','N','O'}, {'P','Q','R','S'},
                                       {'T','U','V'}, {'W', 'X', 'Y', 'Z'}};
        int sum = 0;
        String str = scanner.next();
        for (int i = 0; i < alphas.length; i++){
            for (int j = 0; j < alphas[i].length; j++){
                for (int k = 0; k < str.length(); k++){
                    if (str.charAt(k) == alphas[i][j]){
                        sum += (i + 3);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}