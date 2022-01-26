package baekjoon.implementation;

//별찍기 - 3
import java.util.Scanner;

public class Main2440 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
