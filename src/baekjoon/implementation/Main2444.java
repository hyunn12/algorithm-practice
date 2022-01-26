package baekjoon.implementation;

//별찍기 - 7
import java.util.Scanner;

public class Main2444 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i*2-1); j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2*n-2*i-1); k++) {
                System.out.print("*");
            }

            System.out.println("");

        }

    }
}
