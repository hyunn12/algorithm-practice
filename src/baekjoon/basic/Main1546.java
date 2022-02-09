package baekjoon.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 평균
public class Main1546 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();  // 과목 개수 N
        List<Integer> subject = new ArrayList<>();  // 과목 점수 담을 list

        double sum = 0;  // 원점수 총 합

        for (int i = 0; i < num; i++) {
            int temp = sc.nextInt();

            // 반복문을 돌면서 입력받은 수를 List에 추가하고 sum에 더해서 전체합 구함
            subject.add(temp);
            sum += temp;
        }

        // List와 Collections을 이용해 최댓값 추출
        int max = Collections.max(subject);  // 점수 최댓값 M

        double newAvg = (sum / num) / max * 100;  // 조작한 평균
        System.out.println(newAvg);

        sc.close();
    }

}
