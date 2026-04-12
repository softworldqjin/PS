import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // 참가자 수 세기,
        // map에 name이라는 키값 있으면 해당하는 value값 가져오고, 없으면 0반환 한거에 +1 해서, 
        // key가 name인 value값에 저장
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 완주자 수 빼기
        // key가 name인 value값 가져와서 -1 해서, key가 name인 value값에 저장
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        // 값이 1 남은 사람이 완주하지 못한 사람
        // map에서 key값들(name)을 set형태(중복없이)로 가져와서, 해당하는 value값이 0보다 크면 name 반환 
        for (String name : map.keySet()) {
            if (map.get(name) > 0) {
                return name;
            }
        }

        return "";
    }
}