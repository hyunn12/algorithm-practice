package programmers.level1;

import java.util.stream.LongStream;

// 두 정수 사이의 합
public class Solution12912 {

    public static void main(String[] args) {
        int a = 5, b = 3;
//        solution_1(a, b);
//        System.out.println(solution_2(a, b));
        System.out.println(sol(a, b));
    }

    // 방법1. 단순 반복문
    public static long solution_1(int a, int b) {
        long answer = 0;
        int x = Math.min(a, b);
        int y = Math.max(a, b);

        for (int i = x; i <= y; i++) {
            answer += i;
        }
        System.out.println(answer);
        return answer;
    }

    // 방법2. LongStream을 이용해 범위 내의 숫자를 sum
    public static long solution_2(int a, int b) {
        return LongStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }

    /*
        다른 사람의 풀이
        return (b - a + 1) * (a + b) / 2;

        등차수열의 합 공식을 이용한 풀이
        등차수열의 합
            첫째항 a, 공차 d, 제 n항이 l인 등차수열의 1~n차항까지의 합 S를 구하려면
            S = n(a+l) / 2 가 된다
        여기서 우리 문제에 대입해보면
        n = b-a+1, l = b 이므로 (단, a<b일 때)
        (b-a+1) * (a+b) / 2가 되는 것
     */

    public static long sol(int a, int b) {
        int x = Math.min(a, b), y = Math.max(a, b);
        return (long) (y - x + 1) * (x + y) / 2;
    }

}