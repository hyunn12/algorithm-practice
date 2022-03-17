package codemate;

public class SlidingWindowDrinks {

    public static void main(String[] args) {

        int[][] arr = {
             {0, 100, 320, 0}
            ,{1, 232, 720, 0}
            ,{2, 600, 103, 0}
            ,{3, 100, 124, 0}
            ,{4, 730, 1076, 0}
            ,{5, 185, 125, 0}
            ,{6, 104, 600, 0}
            ,{7, 392, 705, 0}
            ,{8, 33, 265, 0}
            ,{9, 89, 421, 0}
        };
        int sum = 0;
        int max = 0;
        int ans = 0;
        int sum_ta = 0;
        int sum_ca = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i][3] = arr[i][2] - arr[i][1];
        }

        for (int i = 0; i < arr.length-2; i++) {

            sum = arr[i][3] + arr[i+1][3] + arr[i+2][3];

            if (sum > max) {
                max = sum;
                ans = i;
            }
            sum_ta = arr[ans][1] + arr[ans+1][1] + arr[ans+2][1];
            sum_ca = arr[ans][2] + arr[ans+1][2] + arr[ans+2][2];
        }

        System.out.printf("%d %d %d의 ", ans, ans+1, ans+2);
        System.out.printf("카페인 합은 %d, 타우린 합은 %d로 가장 효과가 좋습니다.", sum_ca, sum_ta);
    }

}
