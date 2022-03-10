package codemate;

// 이분 탐색 응용
public class Day3 {

    public static void main(String[] args) {
        // 기존 존재하는 랜선을 잘라 길이가 같은 10개의 랜선으로 만들고자 할 때, 만들 수 있는 랜선의 최대 길이?
        int[] lan = {215, 513, 712, 803}; // 기존 랜선들의 길이
        int length = 0; // 만들어질 랜선의 길이
        int count = 10; // 만들어질 랜선의 개수

        System.out.println("랜선 하나의 길이는 " + calc_length(lan, length, count));
    }

    static int calc_length (int[] lan, int length, int count) {
        int start = 0; // 탐색 배열의 시작 인덱스
        int end = lan[lan.length - 1]; // 끝 인덱스
        int mid = (start + end) / 2; // 중앙값 설정

        while (end >= start) {
            int total = 0; // 전체 길이
            mid = (start + end) / 2; // 매 반복문 돌 때마다 중앙값 리셋

            for (int i : lan) {
                // 반복문을 돌면서 각 랜선별로 중앙값보다 큰지 작은지 판단 후 크다면 total값 초기화
                if (i > mid) {
                    total += i / mid;
                }
            }

            // total이 만들어야할 랜선 개수보다 적을 경우 끝인덱스 감소
            if (total < count) {
                end = mid - 1;
            } else {
                // 아닐 경우 만들어진 랜선의 길이 length를 mid로 설정 후 시작인덱스 증가
                length = mid;
                start = mid + 1;
            }
        }
        // 최종적으로 생성된 랜선의 길이 반환
        return length;
    }

}
