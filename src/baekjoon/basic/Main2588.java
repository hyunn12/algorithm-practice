package baekjoon.basic;

// 세자리 수 곱셈에서 중간과정과 결과에 들어갈 수 
import java.util.Scanner;

public class Main2588 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 1. 각 자리별로 나눠야하는 숫자 y를 String으로 받아 charAt으로 쪼개서 계산
    int x = Integer.parseInt(sc.nextLine());
    String y = sc.nextLine();

    System.out.println(x * (y.charAt(2) - '0'));
    System.out.println(x * (y.charAt(1) - '0'));
    System.out.println(x * (y.charAt(0) - '0'));
    System.out.println(x * Integer.parseInt(y));

    System.out.println("--------");

    // 2. 둘 다 숫자로 받은 뒤 각 자리를 나눈 몫과 나머지로 계산하기
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a * (b%10));  // ex. 385%10 = 5 일의 자리
    System.out.println(a * (b%100/10));  // ex. 385%100 = 85 -> 85/10 = 8 십의 자리
    System.out.println(a * (b/100));  // ex. 385/100 = 3 백의 자리
    System.out.println(a * b);

    sc.close();
  }
}
