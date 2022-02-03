package programmers.level1;

// 최대공약수와 최소공배수
public class Solution12940 {

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int a = Math.max(n, m);
        int b = Math.min(n, m);

        // 1. 최대공약수
        // 1-1. 유클리드 호제법 이용 ( while 반복문 사용 - O(n) )
        //      유클리드 호제법: 2개의 자연수나 정식의 최대 공약수를 구하는 알고리즘의 하나
        //      호제법: 두 수가 서로 상대방 수를 나누어 원하는 수를 얻는 알고리즘
        //      2개의 자연수 a, b (a>b)에 대해 a를 b로 나눈 나머지를 temp라 할 때, a와 b의 최대공약수 = b와 tmep의 최대공약수
        //      b를 temp로 나눈 나머지 temp`를 구하는 과정을 반복해 나머지가 0이 될 때 나누는 수가 a와 b의 최대공약수
//        while (b != 0) {
//            int temp = a % b;
//            a = b;
//            b = temp;
//        }
//        System.out.println("방법1 최대공약수:" + a);
//        answer[0] = a;

        answer[0] = gcd(a, b);
        System.out.println("최대공약수: " + answer[0]);

        answer[1] = lcm(a, b);
        System.out.println("최소공배수: " + answer[1]);

        return answer;
    }

    static int gcd(int a, int b) {
        // 1-2. 재귀함수 이용
        //      위의 코드를 재귀함수로 구현해 훨씬 간단하게 구현 - O(logN)

        if ((a % b) == 0) {
            return b;
        }

        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        // 2. 최소공배수
        // 두 자연수 A, B의 최대공약수가 G이고 최소공배수가 L, 서로소가 a, b일 때
        // L = a * b * G
        // A * B = L * G
        // 0이 아닌 두 수의 곱 / 두 수의 최대공약수
        return a * b / gcd(a, b);
    }

}
