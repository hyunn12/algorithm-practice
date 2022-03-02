package programmers.level1;

// 문자열 다루기 기본
public class Solution12918 {

    public static void main(String[] args) {
        String a = "a234";
        String b = "1234";
        solution_2(a);
        solution_2(b);
    }

    // 풀이1. 단순 반복문
    public static boolean solution_1(String s) {
        int length = s.length();
        if (length != 4 && length != 6) return false;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return true;
    }
    // 풀이2. 예외이용
    public static boolean solution_2(String s) {
        // 문자를 Integer.parseInt 할 경우 NumberFormatException 발생
        // try catch를 이용해 반환할 수 있을까??
        int length = s.length();
        if (length != 4 && length != 6) return false;
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /*
        다른 사람의 풀이
        if (s.matches("^[0-9]{4}|{6}$")) return s.matches("(^[0-9]*$)");
        return false;

        정규표현식을 이용해 길이체크 후 문자열이 전부 숫자와 일치하는지 체크해서 해당 결과값이 boolean 값이라 바로 반환
        정규표현식은 언제봐도...
     */

}
