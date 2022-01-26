package programmers.sort;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = {};

        //answer 배열의 길이를 command에 들어있는 [i,j,k] 배열의 개수인 commands.length로 초기화
        answer = new int[commands.length];

        //[i,j,k] 배열의 개수만큼 반복
        for (int i = 0; i < commands.length; i++) {
            //<<다른사람풀이>>
            // Arrays.copyOfRange: 특정 범위의 배열 복사하는 메소드
            // int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            // Arrays.sort(temp);
            // answer[i] = temp[commands[i][2]-1];

            //정렬 전 i~j 자른 배열 담을 배열 선언
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];

            //해당 배열 내에서 i부터 j까지의 배열담아야하므로 반복
            for (int j = 0; j < temp.length; j++) {

                //temp 배열의 n번째는 array배열의 i부터 j까지의 수인데 배열이므로 인덱스번호처리를 위해 -1
                temp[j] = array[j + commands[i][0] -1];

            }

            //temp배열 정렬
            Arrays.sort(temp);

            //정렬한 배열의 k번째 수 찾기
            answer[i] = temp[commands[i][2]-1];

        }

        return answer;

    }

}
