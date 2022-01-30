package programmers.level1;

// 콜라츠 추측
public class Solution12943 {

    public static void main(String[] args) {
        int num = 626331;
        System.out.println("Solution: "+solution(num));
    }

    // num이 626331일 때 자꾸 488이 리턴되는데 혹시나 해서 매개변수로 받는 num을 long으로 자료형을 변환했더니 제대로된 값이 출력됨
    static int solution(long num) {
        int answer = 0;

        for (answer = 0; answer < 500; answer++) {

            // 결과가 1이 될 때까지 반복
            if (num == 1) return answer;

            // 입력된 수가 짝수라면 2로 나눔
            // 입력된 수가 홀수라면 3곱하고 1더함
            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
        }
        // 500회 연산을 넘어도 1이 되지 않는다면 -1 반환
        return -1;
    }

}
