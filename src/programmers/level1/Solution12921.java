package programmers.level1;

// 소수 찾기 (완전탐색)
public class Solution12921 {

    public static void main(String[] args) {
        solution_2(10);
    }

    // 방법 1. 일일히 나눈 뒤 나누어 떨어지면 소수로 카운트  O(N²)
    // BUT, 이 방법은 매우 비효율적으로 n의 범위도 2이상 1000000이하의 자연수로 매우 넓기때문에 시간초과도 발생함
    public static int solution_1(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) answer++;
        }
        return answer;
    }

    // 방법 2. 제곱근 이용 O(√N)
    // 자연수 n이 소수이려면 n의 제곱근 이하의 어떤 수로도 나눠지지 않아야함
    public static int solution_2(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) answer++;
        }
        return answer;
    }

    // 방법 3. 에라토스테네스의 체
    // 방법2에 에라토스테네스의 체를 이용한 방법
    //    에라토스테네스의 체: 소수의 배수는 소수가 아니다
    public static int solution_3(int n) {
        int answer = 0;

        int[] num = new int[n+1];

        // 2부터 n 까지의 수를 배열에 담음
        for (int i = 2; i <= n; i++) {
            num[i] = i;
        }

        // 2부터 시작해서 그 배수를 다 0으로 만듦
        for (int i = 2; i <= n; i++) {
            // 나중에 바뀐 수의 차례일때 해당 수가 0일 경우 넘어가도록 설정
            if (num[i] == 0) continue;

            for (int j = 2*i; j <= n; j += i) {
                num[j] = 0;
            }
        }

        // 배열에서 0이 아닌 것들 세기
        for (int i : num) {
            if (i != 0) answer++;
        }

        return answer;
    }

}
