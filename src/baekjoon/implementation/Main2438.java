package baekjoon.implementation;

//별찍기 - 1
import java.util.Scanner;

public class Main2438 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        String str = "";
        for (int i = 0; i < n; i++) {
            str += "*";
            System.out.println(str);
        }

    }

}
