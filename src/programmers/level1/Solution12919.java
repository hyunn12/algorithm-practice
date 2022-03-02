package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 서울에서 김서방 찾기
public class Solution12919 {

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
//        solution_1(seoul);
        solution_2(seoul);
    }

    // 방법1. 단순 반복문
    public static String solution_1(String[] seoul) {
        // 문장을 담을 StringBuilder 선언
        StringBuilder sb = new StringBuilder();
        // 김서방의 위치를 나타낼 index 선언
        int idx = 0;
        // seoul만큼 반복문을 돌면서 인덱스에 1을 더하고 Kim을 찾으면 break 되도록
        for (String s : seoul) {
            if (s.equals("Kim")) break;
            idx++;
        }
        // StringBuilder에 문장 append
        sb.append("김서방은 ");
        sb.append(idx);
        sb.append("에 있다");
        System.out.println(sb);
        return sb.toString();
    }

    // 방법2. List로 변환
    public static String solution_2(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        // indexOf 사용 위해 배열을 List로 변환
        List<String> temp = new ArrayList<>(Arrays.asList(seoul));
        sb.append("김서방은 ");
        // indexOf를 통해 해당 object의 index를 바로 append
        sb.append(temp.indexOf("Kim"));
        sb.append("에 있다");
        System.out.println(sb);
        return sb.toString();

        // 뭔가 더 간결해보이기는 하지만 ArrayList를 선언하게되면 메모리를 할당
        // 때문에 자체 for문을 돌리는 것이 더 유리할 수도 있움! => 시간도 for문을 사용하는 것이 훨씬 빠름
    }

    /*
        다른 사람의 풀이
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 "+ x + "에 있다";

        Arrays.asList를 이용해 따로 list를 선언하지 않고 바로 indexOf 사용
        StringBuilder등 선언 않고 바로 반환
    */

}
