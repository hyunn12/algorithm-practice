package baekjoon.basic;

import java.util.Scanner;

// 약수
public class Main2501 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = sc.nextInt();

        if (count == 1) {
            System.out.println(1);
            return;
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count--;
            if (count == 0) {
                System.out.println(i);
                break;
            }
        }

        if (count != 0) System.out.println(0);

        sc.close();
    }

}
