package programmers.level1;

// 시저 암호
public class Solution12926 {

    public static void main(String[] args) {
//        solution("AB", 1);
        solution("a B z", 4);
    }

    public static String solution(String s, int n) {
        StringBuffer sb = new StringBuffer();
        // StringBuffer는 전역변수로
        // StringBuilder는 지역변수로 선언하는게 유리함
        // 동기/비동기처리때문에!

        s.chars().forEach(c -> {
            // 대문자인 경우 변환처리
            // c + n이 Z 넘어갈 경우 분리
            if (Character.isUpperCase(c)) {
                sb.append((c + n <= 90) ? (char) (c + n) : (char) (c + n - 26));
            } else if (Character.isLowerCase(c)){
                // 소문자인 경우도 c + n이 z 넘어갈 경우 처리
                sb.append((c + n <= 122) ? (char) (c + n) : (char) (c + n - 26));
            } else {
                // 공백처리
                sb.append((char) c);
            }
        });

        // AB 65 66 ~ YZ 89 90 / ab 97 98 ~ yz 121 122
        // abc, 5 -> fgh
        // 소문자경우 변환한 숫자 + n 이 122 넘으면 그 글자는 변환숫자 + num - 26

        System.out.println(sb);
        return sb.toString();

        /*
            다른 사람의 풀이
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isLowerCase(ch)) {
                    ch = (char) ((ch - 'a' + n) % 26 + 'a');
                } else if (Character.isUpperCase(ch)) {
                    ch = (char) ((ch - 'A' + n) % 26 + 'A');
                }
                result += ch;
            }

            % 26을 통해 나머지와 a를 더해서 따로 if문 빼지않고 처리할 수 있도록 처리
         */
    }

}
