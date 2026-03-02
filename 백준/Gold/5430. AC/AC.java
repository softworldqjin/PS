import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String f = br.readLine();
            char[] fArray = f.toCharArray();
            int arrayCount = Integer.parseInt(br.readLine());
            Deque<String> dq = new ArrayDeque<>();
            
            String s = br.readLine();
            if (arrayCount > 0){
                String[] str = s.replace("[", "").replace("]", "").split(",");
                for (int j = 0; j < arrayCount; j++){
                    dq.offerLast(str[j]);
                }
            }
            
            boolean result = false;
            boolean reverse = false;
            for (char c : fArray){
                if (c == 'R'){
                    reverse = !reverse;
                } else if (c == 'D'){
                    if (dq.isEmpty()){
                        result = true;
                        break;
                    }
                    if (!reverse){
                        dq.pollFirst();
                    } else {
                        dq.pollLast();
                    }
                }
            }
            if (result){
                System.out.println("error");
            } else{
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                
                while (!dq.isEmpty()){
                    if (!reverse){
                        sb.append(dq.pollFirst());
                    } else {
                        sb.append(dq.pollLast());
                    }
                    
                    if (!dq.isEmpty()){
                        sb.append(",");
                    }
                }
                sb.append("]");
                System.out.println(sb);
            }
            
        }
    }
}