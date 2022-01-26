package programmers.level1;

import java.util.stream.IntStream;

// 행렬의 덧셈
public class Solution12950 {

    public int[][] solution(int[][] arr1, int[][] arr2) {

        // answer, arr1, arr2 세 행렬의 크기가 모두 같음
        // answer의 크기를 arr1의 크기만큼 초기화
        int[][] answer = new int[arr1.length][arr1[0].length];

        /*
            // 다른 사람의 풀이 1
            // 풀이 자체는 내가 푼거와 같이 가지만 배열의 크기가 0일 때를 감안해서 예외처리
            if (arr1.length == 0) {
                return answer;
            }
         */

        // 방법1. for 반복문 사용
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                // 단순하게 for문을 사용해 해당 인덱스로 각각 요소 더하기
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // 방법2. IntStream 반복문 사용
        IntStream.range(0, arr1.length).forEach(i -> {
            IntStream.range(0, arr1[0].length).forEach( j -> {
                // IntStream으로 인덱스 반복
                answer[i][j] = arr1[i][j] + arr2[i][j];
            });
        });

        /*
        // 다른 사람의 풀이 2
            answer = arr1;
            //애초에 다 같은 크기의 배열이기 때문에 answer배열을 arr1로 초기화한 뒤 계산
           for(int i=0; i<arr1.length; i++){
                for(int j=0; j<arr1[0].length; j++){
                    answer[i][j] += arr2[i][j];
                }
            }
        */

        return answer;
    }

}
