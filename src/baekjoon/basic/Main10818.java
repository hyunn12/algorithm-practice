package baekjoon.basic;

import java.util.*;

// 최소, 최대
public class Main10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        // 방법1. 배열 이용
        int[] arr = new int[count];

        // 반복문을 이용해 입력받은 수를 배열에 담음
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        // sort를 이용해 배열을 정렬
        Arrays.sort(arr);

        // 정렬을 했기때문에 배열의 제일 처음 수와 제일 마지막 수가 각각 최소, 최댓값일 것
        int min = arr[0];
        int max = arr[count-1];

        // 방법2. List 이용
        /*
        List<Integer> arr = new ArrayList<>();

        // 반복문을 돌면서 입력받은 수를 List에 담아줌
        for (int i = 0; i < count; i++) {
            arr.add(sc.nextInt());
        }

        Collections의 min과 max를 이용해 최소, 최댓값 추출
        int min = Collections.min(arr);
        int max = Collections.max(arr);

         */

        System.out.println(min + " " + max);

        sc.close();
    }

}
