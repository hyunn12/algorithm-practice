package programmers.level1;

// 짝수와 홀수
public class Solution12937 {

    public String solution(int num) {

        // num을 2로 나눈 나머지가 0일 경우 짝수이므로 삼항연산자를 통해 바로 리턴
        return (num % 2 == 0) ? "Even" : "Odd";
    }

}
