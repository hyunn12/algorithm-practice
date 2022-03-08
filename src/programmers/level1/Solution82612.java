package programmers.level1;

// 부족한 금액 계산하기
public class Solution82612 {

    public static void main(String[] args) {
        int price = 1000;
        int money = 1000000;
        int count = 2500;
        System.out.println(solution_1(price, money, count));
        System.out.println(solution_2(price, money, count));
    }

    // 방법1. 단순반복문 이용
    public static long solution_1(int price, int money, int count) {
        // count 횟수만큼 놀이기구를 탔을 때의 전체 이용료
        long total = 0;

        for (long i = 1; i <= count; i++) {
            total += price * i;
        }

        if (money - total >= 0) {
            return 0;
        } else {
            return total - money;
        }
    }

    // money-total 이 0보다 작을 경우만 둘의 차를 반환
    // = 차가 음수면 0보다 항상 작을 것 -> Max 함수 이용
    // 방법2. 등차수열의 합 이용
    //    등차수열의 합
    //    첫째항 a, 공차 d, 제 n항이 l인 등차수열의 1~n차항까지의 합 S = n(a+l) / 2
    public static long solution_2(int price, int money, int count) {
        // 여기서 a=price, d=price, n=count, l=count*price
        // S = count * (price + count*price) / 2
        //= (count*price)*(1+count)/2
        return Math.max(0, (long) count * (long) price * (long) (1 + count) / 2 - money);
    }

    /*
        다른 사람의 풀이
        long answer = money;
        for (int cnt = 0; cnt < count; ++cnt) {
            answer -= (price * (cnt + 1));
        }
        return (answer > 0 ? 0 : -answer);

        아예 반복문을 돌릴 때 처음 금액에서부터 차감 시작
        만약 answer가 음수라면 돈이 모자랐다는 뜻이므로 -를 붙여서 반환해준 방법
     */

}
