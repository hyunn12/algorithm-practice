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

        s.chars().sorted().forEach(c -> sb.append((char) c));

        System.out.println(sb.reverse());
        return sb.reverse().toString();
    }
}
