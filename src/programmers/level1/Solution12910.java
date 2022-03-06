package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 나누어 떨어지는 숫자 배열
public class Solution12910 {

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        solution_1(arr, divisor);
    }

    // 방법1. for 반복문+stream
    public static int[] solution_1(int[] arr, int divisor) {
        // List.sort 사용 위해 List 선언
        List<Integer> temp = new ArrayList<>();

        // for문으로 i가 divisor로 나누어 떨어지는 경우에만 list에 할당
        for (int i : arr) if (i % divisor == 0) temp.add(i);

        // 만약 arr에서 divisor로 나누어 떨어지는 수가 하나도 없었다면 바로 {-1} 반환
        if (temp.size() == 0) return new int[]{-1};

        // Comparator.maturalOrder 이용해 오름차 정렬
        temp.sort(Comparator.naturalOrder());

        // stream 이용해 toArray (Integer[]) 변환 후 mapToInt 통해 int로 변환해 다시 toArray(int[]) 반환
        return Arrays.stream(temp.toArray()).mapToInt(i -> (int) i).toArray();
    }

    // 방법2. stream.filter 사용
    public static int[] solution_2(int[] arr, int divisor)  {
        // stream.filter를 이용해 따로 for if를 사용하지 않고 조건에 해당하는 배열이 새로 생성되도록 처리
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();

        // 오름차순 정렬
        Arrays.sort(answer);

        // 만약 answer 배열에 아무것도 들어오지 않았다면 나누어 떨어지는 수가 없었다는 것이므로 {-1} 반환
        if (answer.length == 0) return new int[]{-1};

        return answer;
    }

}
