import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> s1 = new ArrayDeque<>();
        
        for (char c : s.toCharArray()){
            if (c == '('){
                s1.add(c);
            }
            else {
                if (s1.isEmpty()){
                    return false;
                }
                s1.poll();
            }
            
        }
        return s1.isEmpty();
        
    }
}