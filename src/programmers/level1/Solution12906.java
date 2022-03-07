package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 같은 숫자는 싫어
public class Solution12906 {

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        solution_1(arr);
    }

    // 들어온 배열 내 연속적인 숫자 제거
    // 중복 제거 후에 원래의 순서 유지해야하므로 sort는..XX
    // List 이용
    public static int[] solution_1(int []arr) {
        // 몇개가 들어올지 모르니까 일단 List 선언
        List<Integer> temp = new ArrayList<>();

        // arr[0]은 비교할 기준이 없으므로 임의의 기준을 -1로 설정
        // arr의 요소의 크기는 0~9이므로
        int idx = -1;
        //향상된 for문을 통해 arr의 요소 반복
        for (int i : arr) {
            // 만약 i가 기준과 다른 숫자라면 연속된 숫자가 아니므로 List에 추가
            if (i != idx) temp.add(i);
            // 추가 후 기준을 현재 숫자로 변경
            // 변경된 기준에 따라 다음 숫자 판별 반복
            idx = i;
        }

        // stream.mapToInt를 통해 List를 Array로 변경해 반환
        return Arrays.stream(temp.toArray()).mapToInt(i -> (int) i).toArray();
    }

}
