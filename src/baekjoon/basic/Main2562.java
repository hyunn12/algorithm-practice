package baekjoon.basic;

// 최댓값
import java.util.Arrays;
import java.util.Scanner;

public class Main2562 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력받은 int를 담을 배열 선언
        int[] temp = new int[9];

        // 입력받는 값을 바로 temp 배열에 담아줌
        for (int i = 0; i < 9; i++) {
            temp[i] = sc.nextInt();
        }

        int maxIdx = 1;

        // 반복문 돌면서 최댓값의 인덱스 찾기
        for (int i = 0; i < 9; i++) {
            // maxIdx는 n번째 숫자이고 i는 인덱스값이기때문에 -1해서 값을 맞춰줌
            // i번째 temp배열의 값이 현재 최대값보다 크다면 해당 값의 순서를 maxIdx로 선언
            if (temp[i] > temp[maxIdx-1]) {
                maxIdx = i+1;
            }
        }

        // Stream과 max, getAsInt 를 통해 해당 배열의 최대값울 한번에 추출
        System.out.println(Arrays.stream(temp).max().getAsInt());
        // 해당 최대값의 순서는 위에서 뽑아낸 maxIdx값으로 설정
        System.out.println(maxIdx);

    }

}
