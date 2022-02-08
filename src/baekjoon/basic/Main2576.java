package baekjoon.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 홀수
public class Main2576 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int sum = 0;  // 홀수인 자연수의 합
        int min = 0;  // 홀수 중 최솟값
        List<Integer> odd = new ArrayList<>();  //홀수를 담을 List

        for (int i = 0; i < 7; i++) {
            int temp = sc.nextInt();
            
            // 2로 나눈 나머지가 1일 경우 홀수
            if (temp % 2 == 1) {
                sum += temp;  // 홀수일 경우 합계에 추가
                
                odd.add(temp);  // 홀수인 경우 list에 추가
            }
        }

        // list의 size가 0 = 모든 수가 짝수
        if (odd.size() == 0) {
            System.out.println(-1);  // -1 출력
            return;
        }

        // Collections 이용해서 최솟값 출력
        min = Collections.min(odd);

        System.out.println(sum);
        System.out.println(min);

        sc.close();
    }

}
