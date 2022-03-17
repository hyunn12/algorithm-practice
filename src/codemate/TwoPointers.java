package codemate;

import java.util.Scanner;

// 투 포인터
public class TwoPointers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int start = 0;
        int end = 0;

        int partial_sum = 0;
        int answer = 0;

        while (start < n) {
            if (partial_sum > m || end >= n) {
                partial_sum -= arr[start++];
            } else if (partial_sum <= m) {
                partial_sum += arr[end++];
            }

            if (partial_sum == m) answer++;
        }
        System.out.println(answer);
    }
}
