package codemate;

// 이분 탐색 재귀 변환
public class Day4 {

    public static void main(String[] args) {
        // 기존 존재하는 랜선을 잘라 길이가 같은 10개의 랜선으로 만들고자 할 때, 만들 수 있는 랜선의 최대 길이?
        int[] lan = {215, 513, 712, 803}; // 기존 랜선들의 길이
        int length = 0; // 만들어질 랜선의 길이

        int start = 0; // 시작 인덱스
        int end = lan[lan.length - 1]; // 끝 인덱스
        int count = 10; // 만들어질 랜선의 개수

        System.out.println("랜선 하나의 길이는 " + calc_length(lan, count, start, end));
    }

    static int calc_length (int[] lan, int count, int start, int end) {
        int mid = (start + end) / 2; // 중앙값 설정
        int total = 0; // 전체 길이

        for (int i : lan) {
            if (i > mid) {
                total += i / mid;
            }
        }

        if (total == count) {
            return mid;
        }else if (total < count) {
            return calc_length(lan, count, start, end - 1);
        } else {
            return calc_length(lan, count, start + 1, end);
        }

    }

}
