package programmers.level1;

import java.util.stream.IntStream;

// x만큼 간격이 있는 n개의 숫자
public class Solution12954 {

    public long[] solution(int x, int n) {
        /*
            // 다른 사람의 풀이
            // 애초에 들어오는 x의 자료형을 long으로 받아서 뒤에서 x를 따로 형변환하지 않아도 되도록 처리
            public long[] solution(long x, int n) {
         */

        // 정답을 담을 answer 배열의 크기를 n으로 초기화
        long[] answer = new long[n];

        // x만큼 간격이 있다는 것은 x의 배수인 행렬 -> x에 인덱스 크기만큼 곱해서 담아준다
        // IntStream 반복문을 통해 answer배열에 x의 배수를 담음
        IntStream.range(0, n).forEach(i -> answer[i] = (long) x * (i+1));

        /*
            // 방법2. for문 사용
            for (int i = 0; i < n; i++) {
                answer[i] = (long) x * (i + 1);
            }
            // 간단한 처리의 경우 for문을 사용하는 것이 더 시간이 짧게 걸림
          */

        return answer;
    }

}
