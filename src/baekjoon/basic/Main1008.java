package baekjoon.basic;

//a / b 출력 소수점까지
import java.util.Scanner;

public class Main1008 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    double c = (double)a/b;
    System.out.println(c);
    sc.close();
  }
}