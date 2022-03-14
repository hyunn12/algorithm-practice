package codemate;

import java.util.Arrays;

// 선택 정렬
public class SelectionSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selection_sort(int[] arr, int length) {
        int least = 0;

        // 마지막 숫자는 자동 정렬됨 -> length-1까지만 반복
        for (int i = 0; i < length -1; i++) {
            least = i;

            // 최솟값 탐색
            for (int j = i+1; j < length; j++) {
                if (arr[j] < arr[least]) least = j;
            }

            // 최솟값이 자기 자신일 경우만 자료이동을 하지 않음음
           if (i != least) {
                swap(arr, i, least);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 7, 3, 5};
        int length = arr.length;
        System.out.println("정렬 전 배열: " + Arrays.toString(arr));

        selection_sort(arr, length);
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }

}
