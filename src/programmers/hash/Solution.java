package programmers.hash;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {

    // participant: 참가자 명단
    // completion: 완주자 명단

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hash = new HashMap<>();

        //participant에는 있고 completion에 없다면 완주하지 못한 사람이므로 해당 요소를 리턴
        //어떻게 비교? -> Key-Value 이용한 해시맵에 넣어서 하나씩 꺼내서 비교
        //배열이면 sort하고 꺼내서 비교하다가 다른부분의 인덱스 찾아서 꺼내면 되려나..?
        //해시는??? => getOrDefault 이용
        //Hash는 동일한 key값에 다른 value를 입력하면 덮어씌워지게됨
        //기존 value를 유지하고싶다면 getOrDefault 이용해서 value가 없을때만 defaultValue를 리턴

        //참가자를 key로, 동명이인이 존재할 수 있으므로 value가 없을 때만 0 + 1 이 되도록 설정
        for (String p : participant) hash.put(p, hash.getOrDefault(p, 0) + 1);

        //완주자를 key로 놓고 해당값을 불러와서 -1 해주기 -> 완주했다면 value 가 0
        for (String c: completion) hash.put(c, hash.get(c) - 1);

        //hash table의 keyset 을 불러와 해당 키의 값이 0이 아니면 완주하지 못한 선수이므로 해당 값을 answer에 넣어주고 끝내기
        for (String ans : hash.keySet()) {

            if (hash.get(ans) != 0) {

                answer = ans;
                break;

            }

        }

        return answer;
    }

}
