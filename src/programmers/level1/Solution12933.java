package programmers.level1;

import java.util.Arrays;

// 정수 내림차순으로 배치하기
public class Solution12933 {

    public static long solution(long n) {

        // 입력받은 정수를 String으로 변환 후 character의 배열로 변환
        char[] temp = Long.toString(n).toCharArray();

        // 오름차순 정렬
        Arrays.sort(temp);

        // 정렬한 character를 담을 StringBuilder 선언
        StringBuilder sb = new StringBuilder();

        // character를 순서대로 StringBuilder에 할당
        for (char c : temp) sb.append(c);

        // reverse를 이용해 StringBuilder를 역순으로 바꾼 뒤
        // toString으로 String으로 바꾸고
        // parseLong을 이용해 Long으로 형변환해서 반환
        return Long.parseLong(sb.reverse().toString());

        // 원래는 Arrays.sort(arr, Collections.reverseOrder()); 를 사용하고싶었지만
        // primitive type은 사용할 수 없어서 StringBuilder를 사용해 reverse 적용

        /*
            [ 다른 사람의 풀이 1 ]
            res = "";
            Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
            return Integer.parseInt(res);

            처음부터 long이 아니라 int로 받고 반환하도록 메소드 변경 후 진행
            chars를 통해 character를 바로 정렬해서 String의 앞부분에 추가되도록해 역순이 되도록 함
         */

        /*
            [ 다른 사람의 풀이 2 ]
            return Long.parseLong(String.valueOf(n).chars().mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString());

            한줄로 작성하긴 했는데 확실히 가독성이..
            collect를 사용해 StringBuilder를 선언하지 않고 바로 적용해 toString으로 반환
        */
    }

}
