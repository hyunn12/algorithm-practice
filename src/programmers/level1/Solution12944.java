package programmers.level1;

import java.util.Arrays;

// 평균 구하기
public class Solution12944 {
    public double solution(int[] arr) {
        double answer = 0;

        // 플이 1.
        // 단순 반복문을 이용해 합을 구하고 나눠서 평균 구함
        double sum = 0;

        for (double i : arr) {
            sum += i;
        }

        answer = (sum / arr.length);

        // 풀이2.
        // Arrays.stream과 average 함수를 통해 평균을 구하고 orElse를 통해 리턴값이 없을 경우 0을 반환하도록 설정
        answer = Arrays.stream(arr).average().orElse(0);

        return answer;
    }
}
