package programmers.level1;

import java.util.stream.Stream;

// 하샤드 수
public class Solution12947 {

    public boolean solution(int x) {

        // 1. 입력받은 x를 String으로 변환
        // 2. split을 이용해 각 자리수로 분리
        // 3. mapToInt와 parseInt를 통해 int 형변환
        // 4. toArray 통해 배열에 담음
        int[] arrNum = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();

        // 각 자리 수를 합한 수가 될 ans
        int ans = 0;

        // 배열의 요소를 더해 ans에 담음
        for (int i : arrNum) {
            ans += i;
        }

        // 더한 값과 x를 나눈 나머지가 0일 경우 하샤드수 = true이므로 해당 값을 바로 반환
        return ((x % ans) == 0);

        /*
            다른 사람의 풀이 1.
            Integer.toString(num).chars().forEach(c -> sum += c - '0');
            return num % sum == 0;
            람다식을 이용해 toString한 것을 각각 char로 변환 후 각 자리를 어디에 담지않고 -'0'을 통해 int화 시켜 바로 sum에 더해버림
         */
    }

}
