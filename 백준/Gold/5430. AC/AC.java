import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String f = br.readLine();
            int length = Integer.parseInt(br.readLine());
            String s = br.readLine();
            Deque<String> dq = new ArrayDeque<>();
            
            if (length > 0){
                String[] array = s.replace("[", "").replace("]", "").split(",");
                for (int j = 0; j < length; j++){
                    dq.addLast(array[j]);
                }
            }
            
            boolean result = false;
            boolean reverse = false;
            for (char c : f.toCharArray()){
                if (c == 'R'){
                    reverse = !reverse;
                } else {
                    if (dq.isEmpty()){
                        result = true;
                        break;
                    }
                    else {
                        if (reverse){
                            dq.pollLast();
                        } else {
                            dq.pollFirst();
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            if (result){
                System.out.println("error");
            } else {
                sb.append("[");
                if (reverse){
                    while (!dq.isEmpty()){
                        sb.append(dq.pollLast());
                        if (!dq.isEmpty()){
                            sb.append(",");
                        }
                    }
                } else {
                    while (!dq.isEmpty()){
                        sb.append(dq.pollFirst());
                            if (!dq.isEmpty()){
                                sb.append(",");
                            }
                        }
                    }
                
                sb.append("]");
                System.out.println(sb);
            }
        }
    }
}