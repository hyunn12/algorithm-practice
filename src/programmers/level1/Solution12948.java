package programmers.level1;

import java.util.stream.IntStream;

// 핸드폰 번호 가리기
public class Solution12948 {

    public String solution(String phone_number) {

        String answer = "";

        //핸드폰번호와 *을 담기 위해서 StringBuilder 선언
        StringBuilder sb = new StringBuilder();

        // IntStream.range를 통해 핸드폰 번호의 길이에서 뒤 4자리를 뺀만큼 *을 추가
        IntStream.range(0, phone_number.length() - 4).forEach(x -> sb.append("*"));

        // 뒤 4자리는 substring통해서 잘라서 추가
        sb.append(phone_number.substring(phone_number.length() - 4, phone_number.length()));

        //결과에 StringBuilder를 toString해서 반환
        answer = sb.toString();

        return answer;

        /*
            다른사람의 풀이 1.
            char[] ch = phone_number.toCharArray();
             for(int i = 0; i < ch.length - 4; i ++){
                 ch[i] = '*';
             }
             return String.valueOf(ch);
             처음부터 String을 char 배열에 담아두고 뒤 4자리를 제외한 나머지 자리를 *로 대체
         */
        /*
            다른 사람의 풀이 2.
            return phone_number.replaceAll(".(?=.{4})", "*");
            정규식을 활용해 간단하게 끝낸 풀이
                1) . -> 임의의 문자 한 개
                2) (?=.) -> 뒷쪽에 임의의 문자 한 개를 제외하고 선택
                3) {숫자} -> 숫자 만큼의 자릿수
                4) .(?=.{4}) ==> 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택
         */
        /*
            다른 사람의 풀이 3.
            String answer = phone_number.substring(0,phone_number.length()-4)
                .replaceAll(".","*")+phone_number.substring(phone_number.length()-4);
            동일하게 substring을 사용했지만 replaceAll을 사용해 더 간결하게 표현
         */
    }

}
