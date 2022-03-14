package codemate;

import java.util.Arrays;

// 퀵 정렬
public class QuickSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quick_sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // pivot은 항상 오른쪽 끝 값
        int pivot = arr[end];
        // 왼쪽포인터는 왼쪽 첫 값
        int left = start;

        // 오른쪽 포인터가 pivot보다 작아질 때까지 증가
        for (int right = start; right < end; right++) {
            // 오른쪽 포인터가 pivot보다 작을 시 왼쪽, 오른쪽 포인터값 스왑
            if (arr[right] < pivot) {
                swap(arr, left, right);
                // 왼쪽 포인터 증가
                left++;
            }
        }

        // 반복문 통해 오른쪽 포인터가 pivot 위치에 닿았으므로 pivot과 왼쪽 포인터 값 스왑
        swap(arr, left, end);

        // 이동한 pivot의 위치 기준으로 왼쪽 배열, 오른쪽 배열 나눠 재귀함수수 적용
       quick_sort(arr, start, left -1);
        quick_sort(arr, left +1, end);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 6, 2, 1, 4};
        System.out.println("정렬 전 배열: " + Arrays.toString(arr));

        quick_sort(arr, 0, 6);
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }

}