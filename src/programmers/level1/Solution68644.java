package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 두 개 뽑아서 더하기
public class Solution68644 {

    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};
        Arrays.stream(solution(numbers)).forEach(System.out::println);
    }

    // 방법1. Set을 이용해 중복제거
    public static int[] solution(int[] numbers) {
        // 중복 방지를 위해 Set으로 설정
        Set<Integer> temp = new HashSet<>();

        // 이중 for문을 통해서 temp에 해당값과 다음 값을 담음
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                temp.add(numbers[i] + numbers[j]);
            }
        }

        // steam을 통해 set을 array로 변경해 반환
        return temp.stream().sorted().mapToInt(i -> i).toArray();
    }

}
