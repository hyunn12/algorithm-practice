package baekjoon.basic;

// 팩토리얼
import java.util.Scanner;

public class Main10872 {

    public static void main(String[] args) {

        // 정수 N 입력받음
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 결과값 출력
        System.out.println(factorial(num));
    }

    // 팩토리얼 구현 위해 따로 메소드 분리
    public static int factorial(int num) {

        // N이 0, 1일 경우 바로 1을 반환
        if (num <= 1) return 1;

        // 아닐 경우 재귀함수를 이용해 팩토리얼 구현
        return num * factorial(num-1);
    }

}
