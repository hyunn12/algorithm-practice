package programmers.level1;

// 정수 제곱근 판별
public class Solution12934 {
    // 임의의 양의 정수 n에 대해 어떤 양의 정수 x의 제곱인지 판별

    public long solution(long n) {

        // 제곱근을 구하는 함수 Math.sqrt 이용해서 n의 제곱근 x 추출
        double x = Math.sqrt((double) n);

        // 만약 x가 정수라면 소수점 이하 XX
        // 실수값인 x에서 int로 형변환한 x를 빼서 정수인지 판별
        // 제곱이 아니라면 -1 리턴
        if (x - (int) x != 0.0) return -1;

        // 제곱이라면 x+1의 제곱 리턴
        return (long) Math.pow(x + 1, 2);

        // 풀이 2. 삼항연산자 이용
//        return (x - (int) x == 0.0) ? (long) Math.pow(x + 1, 2) : -1;

        /*
            [ 다른 사람의 풀이 ]
            if (Math.pow((int)Math.sqrt(n), 2) == n) {
                return (long) Math.pow(Math.sqrt(n) + 1, 2);
            }
            정수인지 판별 위해 int로 형변환한 제곱근을 바로 제곱해서 n과 비교교
        */
    }

}
