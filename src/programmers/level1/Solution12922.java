package programmers.level1;

// 수박수박수박수박수박수?
public class Solution12922 {

    public static void main(String[] args) {
        solution(3);
    }

    public static String solution(int n) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sb.append(i % 2 == 0 ? "수" : "박");
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    /*
        다른 사람의 풀이 1.
        String text = "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박...";
        public String solution(int n) {
            String answer = text.substring(0, n);
            return answer;
        }

        n이 10,000이하인 자연수이므로 수박수박이 만번 반복되어있는 text선언 후 substring이용해 해당 길이만큼 잘라내서 반환
        참신하고 속도는 빠를듯했음
     */

    /*
        다른 사람의 풀이 2.
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);

        n을 2로 나누고 1을 더한만큼 길이로 String 생성
        정규표현식을 이용해 빈 문자열 하나당 '수박' 할당
        거기서 substring을 이용해 잘라냄
     */
}
