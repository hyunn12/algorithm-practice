package programmers.level1;

import java.util.stream.IntStream;

// 약수의 합
public class Solution12928 {

    public static void main(String[] args) {
        // 정수 n을 입력받아 n의 모든 약수의 합을 리턴
        solution_1(12);
        solution_2(12);
    }

    // 방법1. 단순반복문 사용
    public static int solution_1(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }

        return answer;
    }

    // 방법2. IntSteam을 이용한 반복
    public static int solution_2(int n) {
        // 위의 코드를 IntSteam과 filter, sum을 이용해 구현
        int answer = IntStream.rangeClosed(1, n/2).filter(i -> n % i == 0).sum();

        return answer + n;
    }

    /*
        다른 사람의 풀이
         for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) answer += i;
        }
        return answer + n;
        n의 약수 중 본인을 제외한 가장 큰 수 가 n/2이므로
        반복문은 n/2만큼만 돌린 뒤 n을 다시 더하면 약수의 합과 같아지는 것을 이용해 반복문을 덜 돌도록 설계
     */
}
