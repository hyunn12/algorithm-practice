package baekjoon.basic;

// 카이사르 암호
import java.util.Scanner;

public class Main5598 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String code = sc.nextLine();

        // 두 방법 다 아스키 코드 이용해서 문제 해결

        // 방법 2.
        // char배열화 동시에 바로 예외처리하면서 출력
        code.chars().forEach(c -> {

            if (c <= 'C') {
                // A = 65, X = 88
                // A 입력 시 X가 되어야하므로 입력한 값에 23 더해주기
                System.out.print((char) (c + 23));
            } else {
                System.out.print((char) (c - 3));
            }

        });

        /*
        방법 1.
        입력받은 String을 char배열화 시켜서 각각 변환하면서 ABC만 예외처리
        char[] code = sc.nextLine().toCharArray();

        char[] answer = new char[code.length];

        for (int i = 0; i < code.length; i++) {
            if (code[i] == 'A') {
                answer[i] = 'X';
            } else if (code[i] == 'B') {
                answer[i] = 'Y';
            } else if (code[i] == 'C') {
                answer[i] = 'Z';
            } else {
                answer[i] = (char) (code[i] - 3);
            }
        }

        System.out.print(answer);
         */

    }

}
