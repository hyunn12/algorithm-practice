package baekjoon.implementation;

//별찍기 - 6
import java.util.Scanner;

public class Main2443 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2*n-2*i+1); k++) {
                System.out.print("*");
            }

            System.out.println("");

        }

    }

}
