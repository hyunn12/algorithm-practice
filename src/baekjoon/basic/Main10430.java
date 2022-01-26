package baekjoon.basic;

// a b c 입력받아 각 수식의 결과 값 출력(비교)
import java.util.Scanner;

public class Main10430 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println((a+b)%c);
    System.out.println(((a%c)+(b%c))%c);
    System.out.println((a*b)%c);
    System.out.println(((a%c)*(b%c))%c);

    sc.close();
  }
}