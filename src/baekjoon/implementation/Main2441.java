package baekjoon.implementation;

//별찍기 - 4
import java.util.Scanner;

public class Main2441 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {

                System.out.print(" ");

            }

            for (int k = i; k <= n; k++) {

                System.out.print("*");

            }

            System.out.println("");

        }

    }

}
