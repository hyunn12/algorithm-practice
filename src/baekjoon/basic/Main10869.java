package baekjoon.basic;

// a, b 입력받아 사칙연산 출력
import java.util.Scanner;

public class Main10869 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
    sc.close();
  }
}