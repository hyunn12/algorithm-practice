package programmers.level1;

// 이상한 문자 만들기
public class Solution12930 {

    public static void main(String[] args) {
        solution("try hello world");
    }

    public static String solution(String s) {
        // 공백을 기준으로 단어별 짝 홀 인덱스를 판단
        // 각 단어별로 -> String.split(" ")??
        // 낱말별로?? -> String.split("")
        // String으로 쪼개서 toUpperCase / toLowerCase

        int idx = 0; // 각 낱말의 인덱스로 사용할 idx선언
        StringBuilder sb = new StringBuilder(); // 변환한 단어를 담을 StringBuilder

        String[] temp = s.split(""); // 문장을 각각 쪼깨서 배열에 할당
        // toUpperCase와 toLowerCase는 String에만 사용 가능하므로 String배열로 받음

        for (String str : temp) {
            // str이 공백일 시 idx를 초기화하고 StringBuilder에 띄어쓰기 할당
            if (str.equals(" ")) {
                sb.append(" ");
                idx = 0;
                continue;
            }

            // idx가 짝수면 대문자로, 홀수면 소문자로 변환해 StringBuilder에 할당
            if (idx % 2 == 0) {
                sb.append(str.toUpperCase());
            } else {
                sb.append(str.toLowerCase());
            }

            // 단어 하나의 연산이 끝나면 idx에 1을 더해줌
            idx++;
        }

        return sb.toString();

        /*
            다른 사람의 풀이
            for(String ss : array) {
                cnt = ss.contains(" ") ? 0 : cnt + 1;
                answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
            }
            비슷하게 "" 으로 쪼개서 낱말을 String배열에 담은 것까지는 비슷했지만 String 자체에 += 해준 케이스
            코드는 간결하고 좋지만 String 자체에 연산을 하게되면 매번 새로운 객체가 생성되기때문에 메모리나 속도면에서 좋지 않을거같은데..
            sb.append로는 삼항연산자를 사용할 방법이 없을까?
         */
    }
}
