package programmers.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 문자열 내 마음대로 정렬하기
public class Solution12915 {

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
//        String[] strings = {"abce", "abcd", "cdx"};
//        int n = 2;
        solution(strings, n);
    }

    // 방법1. 반복문, split 이용
    public static String[] solution(String[] strings, int n) {
        // List.sort 사용위해 n번째 문자 담을 List 선언
        List<String> temp = new ArrayList<>();

        // n번째 문자만 담으면 정렬 후 answer을 같은 순서로 반환하기 어려움..
        // -> 처음부터 같이 담으면? n번째문자 + 원래문자열
        // => Map? 그런데 같은 문자가 담길 수 있으니 map은 안됨
        // 그럼 처음 담을 때 붙여서 담고 나중에 substring?
        for (String str : strings) {
            temp.add(str.split("")[n] + str);
        }

        // List.sort 이용해 오름차 정렬
        temp.sort(Comparator.naturalOrder());

        // 정렬한 list를 옮길 배열 선언
        String[] answer = temp.toArray(new String[temp.size()]);

        // 정렬 후 answer에 temp의 요소를 맨앞자리를 제거해서 옮겨담음
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i).substring(1);
        }

        return answer;
    }

    /*
        다른 사람의 풀이 1.
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });

        Arrays.sort 내부에서 Comparator의 compare를 오버라이딩해서 구현한 방법
        생각지도 못해본 방법...!
     */

    /*
        다른 사람의 풀이 2.
        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
        return strings;

        함수형인터페이스를 이용해 간단하게 풀이
        나도 함수형 인터페이스를 잘 사용할 수 있도록 공부해야겠다
     */

}
