package programmers.level1;

// 문자열 내림차순으로 배치하기
public class Solution12917 {

    public static void main(String[] args) {
//        String s = "Zbcdefg";
        String s = "AXBYCZabcd";
        solution(s);
    }

    // 방법1. chars로 각각 정렬하고 StringBuilder.reverse 이용
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        // 소문자를 z부터 a까지, 그 다음 대문자를 Z부터 A까지 정렬하라는 것은 유니코드에서 역순에 해당 = 역순(내림차)정렬
        // String을 chars를 이용해 문자단위로 끊고 바로 오름차정렬해 각각 StringBuilder에 담아줌
        s.chars().sorted().forEach(c -> sb.append((char) c));

        System.out.println(sb.reverse());
        // StringBuilder의 reverse를 이용해 오름차정렬된 것을 내림차정렬로 바꿔서 String으로 반환
        return sb.reverse().toString();
    }

    /*
        다른 사람의 풀이
        public String reverseStr(String str){
            return Stream.of(str.split(""))
                         .sorted(Comparator.reverseOrder())
                         .collect(Collectors.joining());
        }

        split을 이용해 문자단위로 자른 것을 Stream으로 각각 Comparator reverseOrder 로 역순정렬되도록 하고
        Collectors.joining을 이용해 다시 문자열로 붙여 반환함
        Collectors의 joining은 처음보는데 기억해두자
     */
}
