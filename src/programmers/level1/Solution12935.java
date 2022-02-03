package programmers.level1;

import java.util.Arrays;

// 제일 작은 수 제거하기
public class Solution12935 {

    public static int[] solution(int[] arr) {
        System.out.println(Arrays.toString(arr));
        //리턴하려는 배열이 빈 배열일 경우 배열에 -1을 채워 리턴
        if (arr.length == 1) {
            return new int[] {-1};
        }

        // [ Stream 사용 ]
        // Stream을 사용하면 가독성은 좋지만 내부반복자를 이용하기때문에 속도가 다른 코드에 비해 확 늘어나서 고민..
        // stream.min을 사용해 최소값을 추출하고
        // stream.filter를 사용해 해당 최소값이 아닌 요소만 추출해 toArray로 만들어 반환
        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays.stream(arr).filter(x -> x != min).toArray();

        /*
            [ 다른 사람의 풀이 ]
            arr과 answer의 index가 일치하지 않으므로
            for을 사용하지 않고 서로 다른 index 설정해서 while로 반복문 돌림
            int i = 0, j = 0;
            while(i < answer.length){
                if(j == minIndex){
                    j++;
                    continue;
                }
                answer[i++] = arr[j++];
            }
         */
    }

}
