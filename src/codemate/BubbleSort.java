package codemate;

import java.util.Arrays;

// 버블 정렬
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        int length = arr.length;
        System.out.println("정렬 전 배열: " + Arrays.toString(arr));

        print_arr(arr, length);
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }

    public static void print_arr(int[] arr, int length) {
        int temp = 0;

        // 배열의 크기만큼 반복
        for (int i = 0; i < length; i++) {
            // 배열의 총 크기에서 i+1 뺀만큼 반복
            for (int j = 0; j < length -i -1; j++) {
                // 현재 j인덱스 위치의 값이 j+1 인덱스 위치의 값보다 더 클 경우 두 값의 위치 변경
                if (arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
