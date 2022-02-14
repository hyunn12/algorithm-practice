package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 자연수 뒤집어 배열로 만들기
public class Solution12932 {

    public static void main(String[] args) {
        solution(12345L);
        // 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열로 리턴
    }

    // 풀이1. Stream, Collections 사용으로 인해 속도 매우 느려짐 2ms대
    public static int[] solution(long n) {
        String temp = Long.toString(n);

        // 각 자리별로 쪼개기 위해 String으로 변환 이용
        // reverse 이용 위해 String을 split으로 쪼개서 List로 받음
        List<String> list = new ArrayList<>(Arrays.asList(temp.split("")));

        Collections.reverse(list);

        // stream을 통해 각 자리를 int로 받아 array로 반환
        return list.stream().mapToInt(Integer::parseInt).toArray();
    }

    // 풀이 2. StringBuffer에 할당 후 reverse를 통해 뒤집고 단순 for문을 사용함으로써 속도를 높임 - 0.2ms 미만
    public static int[] solution2(long n) {
        // String 대신 StringBuffer의 reverse 이용
        StringBuilder sb = new StringBuilder();
        sb.append(n).reverse();

        // 뒤집은 StringBuffer를 String으로 받아 각 자리별로 쪼개어 배열에 담고
        String[] arr = sb.toString().split("");

        int[] answer = new int[arr.length];

        // 단순 반복문을 통해 각 자리별 숫자를 answer 배열에 담음
        for (int i = 0; i < arr.length; i++) answer[i] = Integer.parseInt(arr[i]);

        return answer;
        /*
            return Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
            풀이 3. 위의 코드를 메소드 참조와 Stream을 통해 줄여봄, 하지만 속도가 너무 올라가버림 - 1.8ms대
            단순히 보기 좋고 깔끔한 코드가 다가 아닌거같단생각...
         */
    }

    /*
        다른 사람의 풀이 1.
        String a = "" + n;
        int[] answer = new int[a.length()];
        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;

        "" + n 을 통해서 따로 toString을 사용하지 않고 내부적으로 StringBuffer가 생성되도록함
        입력받은 n을 10으로 나눈 나머지를 구하고 10으로 나눠주면서 각 자리의 숫자를 구해 answer배열에 추가가
    */

    /*
        다른 사람의 풀이 2.
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();

        StringBuilder를 선언함과 동시에 바로 리턴
        제일 깔끔하지만 조금 가독성이 떨어지고 속도 올라감 - 최고 11ms까지도
     */


}
