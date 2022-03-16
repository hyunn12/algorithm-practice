package codemate;

import java.util.ArrayList;
import java.util.List;

// 소수 판별
//  연속된 소수들을 더해 N을 만들 수 있는지 여부
public class SumOfPrimeNumbers {

    public static void answer(int n) {
        boolean[] temp = new boolean[n+1];

        for (int i = 0; i <= n; i++) {
            temp[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp[i]) {
                for (int j = i*i; j <= n; j += i) {
                    temp[j] = false;
                }
            }
        }

        List<Integer> primeNums = new ArrayList<>();
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            if (temp[i]) {
                sum += i;
                primeNums.add(i);
                if (sum == n) {
                    System.out.println("연속된 소수 " + primeNums + "의 합은 " + sum + "입니다.");
                    return;
                }
            }
        }
        System.out.println("연속된 소수의 합으로 " + n + "을 만들 수 없습니다.");
    }

    public static void answer1(int n) {
        int[] num = new int[n+1];

        // 2부터 n 까지의 수를 배열에 담음
        for (int i = 2; i <= n; i++) {
            num[i] = i;
        }

        // 2부터 시작해서 그 배수를 다 0으로 만듦
//        for (int i = 2; i <= n; i++) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // 나중에 바뀐 수의 차례일때 해당 수가 0일 경우 넘어가도록 설정
            if (num[i] == 0) continue;

            for (int j = 2*i; j <= n; j += i) {
                num[j] = 0;
            }
        }

        // 합을 만들 수 있는 소수를 담을 List 선언
        List<Integer> primeNums = new ArrayList<>();
        int sum = 0;

        // 반복문 돌면서 0이 아닌 수 = 소수를 더해서 n이 나오면 리턴
        for (int i : num) {
            if (i != 0) {
                sum += i;
                primeNums.add(i);
                if (sum == n) {
                    System.out.println("연속된 소수 " + primeNums + "의 합은 " + sum + "입니다.");
                    return;
                }
            }
        }
        System.out.println("연속된 소수의 합으로 " + n + "을 만들 수 없습니다.");
    }

    public static void main(String[] args) {
        answer1(41);
        answer1(20);
    }

}
