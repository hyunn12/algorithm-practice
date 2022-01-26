package baekjoon.bruteforce;

//블랙잭
import java.util.Scanner;

public class Main2798 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = scan(arr, n, m);
        System.out.println(result);

    }

    public static int scan(int[] arr, int n, int m) {

        int result = 0;

        for (int i = 0; i < n-2; i++) {

            for (int j = i+1; j < n-1; j++) {

                for (int k = j+1; k < n; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum <= m) {

                        if (m == sum) return sum;

                        if (result < sum) result = sum;

                    }

                }

            }

        }

        return result;

    }

}
