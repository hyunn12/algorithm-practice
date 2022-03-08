package programmers.level1;

import java.util.stream.IntStream;

// 나머지가 1이 되는 수 찾기
public class Solution87389 {

    public static void main(String[] args) {
        int n = 10;
//        int n = 12;
//        System.out.println(solution_1(n));
        System.out.println(solution_2(n));
    }

    // 방법1. 단순반복문
    public static int solution_1(int n) {
        // 자연수 로 나눈 나머지가 1이 되는 가장 작은 수
        for (int i = 2; i < n; i++) if (n % i == 1) return i;
        return n;
    }

    // 방법2. stream 이용
    // 다만 stream을 사용하면 성능이 확 떨어져서 이렇게 단순 반복문용으로는 사용하는 것을 그다지 권장하지 않음
    public static int solution_2(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().getAsInt();
    }

    /*
        다른 사람의 풀이
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);

        나처럼 IntSteam을 사용했지만 마지막에 orElse(0)을 이용 -> isPresent check 해결
     */
}
