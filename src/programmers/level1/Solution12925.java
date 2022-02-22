package programmers.level1;

// 문자열을 정수로 바꾸기
public class Solution12925 {

    public static void main(String[] args) {
        String s = "-1234";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        // Integer.parseInt 함수를 이용해 처리
        return Integer.parseInt(s);
    }

    /*
        다른 사람의 풀이
        boolean Sign = true;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-') Sign = false;
            else if(ch !='+') result = result * 10 + (ch - '0');
        }
        return Sign ? 1 : -1 * result;
        따로 boolean을 설정해 입력받은 String이 양수인지 음수인지를 판별 후 맨 앞의 글자가 -이면 -1을 곱해줌
        java.lang.Integer의 parseInt 메서드 내용을 보면 비슷하게 전개가 되는 것을 볼 수 있음
     */

}
