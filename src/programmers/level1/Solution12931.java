package programmers.level1;

import java.util.Arrays;

// 자릿수 더하기
public class Solution12931 {

    public static void main(String[] args) {
        solution(123);
    }

    public static int solution(int n) {
        // 이전의 자연수 뒤집어 배열로 만들기 비슷한 문제
        // 자연수 n의 각 자리수를 더해서 리턴
        // Stream과 메소드참조를 통해 한줄로 반환
        return Arrays.stream(Integer.toString(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
