package baekjoon.basic;

import java.util.Arrays;
import java.util.Scanner;

// 약수
public class Main1037 {

    public static void main(String[] args) {

        // 양수 N
        int result = 0;

        Scanner sc = new Scanner(System.in);

        // 양수 N의 약수의 개수
        int count = sc.nextInt();

        // 양수 N의 약수를 담을 배열 선언
        int[] div = new int[count];

        // 반복문을 통해 배열에 약수를 담아줌
        for (int i = 0; i < count; i++) {
            div[i] = sc.nextInt();
        }

        // 오름차 정렬
        Arrays.sort(div);

        // 양수 N의 약수 중에서 가장 작은 수와 가장 큰 수를 곱하면 N이 됨
        result = div[0] * div[count-1];

        System.out.println(result);
        sc.close();
    }

}
