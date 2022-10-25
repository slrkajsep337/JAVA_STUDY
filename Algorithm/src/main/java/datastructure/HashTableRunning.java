package datastructure;

import java.util.HashMap;
import java.util.Map;

//프로그래머스 - 완주하지 못한 선수
public class HashTableRunning {

    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            Map<String, Integer> hm = new HashMap<>();

            for(String p: participant) {
                hm.put(p, hm.getOrDefault(p, 0)+1);
            }
            for(String c: completion) {
                hm.put(c, hm.getOrDefault(c, 0)-1);
            }

            for(String key: hm.keySet()) {
                if(hm.get(key) != 0) {
                    answer += key;
                    break;
                }
            }

            return answer;
        }
    }
}
