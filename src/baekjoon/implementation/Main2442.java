package baekjoon.implementation;

//별찍기 - 5
import java.util.Scanner;

public class Main2442 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < (n-i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i*2-1); j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }

}
