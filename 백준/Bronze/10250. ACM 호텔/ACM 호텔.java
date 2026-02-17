import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int test = sc.nextInt();
        for (int i = 0; i < test; i++){
            int floor = sc.nextInt();
            int room = sc.nextInt();
            int count = sc.nextInt();
            
            int floor2 = count % floor;
            int room2 = count / floor + 1;
            if (floor2 == 0){
                floor2 = floor;
                room2 = count / floor;
            }
            
            sb.append(floor2);
            if (room2 < 10){
                sb.append(0);
            }
            sb.append(room2).append("\n");
        }
        
        System.out.println(sb);
    }
}