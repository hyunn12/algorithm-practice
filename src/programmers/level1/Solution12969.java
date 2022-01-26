package programmers.level1;

import java.util.Scanner;
import java.util.stream.IntStream;

// 직사각형 별찍기
public class Solution12969 {

    public static void main(String[] args) {
        // n과 m을 차례로 입력받은 뒤 n*m 크기의 별을 찍어야함
        Scanner sc = new Scanner(System.in);

        // n = a / m = b
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 3. 세로길이가 a여야하므로 외부에서 b의 크기만큼 반복
        for (int i = 0; i < b; i++) {
            // 1. 가로길이만큼 내부에서 a만큼 반복
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            // 2. 줄바꿈을 위해 a만큼 반복이 끝날 때마다 줄바꿈공백 추가
            System.out.println("");
        }

        /*
            // 다른사람의 풀이 1
            StringBuilder sb = new StringBuilder();

            // 가로길이 a만큼 forEach반복문을 통해 StringBuilder에 *을 담아주고
            IntStream.range(0, a).forEach(s -> sb.append("*"));
            // 세로길이 b만큼 StringBuilder 반복
            IntStream.range(0, b).forEach(s -> System.out.println(sb));
         */

        /*
            // 다른 사람의 풀이 2
            for (int i = 0; i < b; i++) {
                // repeat 메소드를 이용해서 반복문을 줄여버림
                System.out.println("*".repeat(a));
            }
         */

    }

}
