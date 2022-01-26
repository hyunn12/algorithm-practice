package programmers.bruteforce;

import java.util.ArrayList;

class Solution {

    public static int[] solution(int[] answers) {

        int[] answer = {};  //정답 개수 저장할 배열

        int[] p1 = {1,2,3,4,5};             //1번 수포자
        int[] p2 = {2,1,2,3,2,4,2,5};       //2번 수포자
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};   //3번 수포자

        int s1 = 0, s2 = 0, s3 = 0;  //수포자들 정답 개수 저장할 int

        //받아온 정답과 수포자들의 정답 비교해 정답이면 정답 개수에 +1
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) s1++;
            if (answers[i] == p2[i % p2.length]) s2++;
            if (answers[i] == p3[i % p3.length]) s3++;
        }

        //정답 개수 s1, s2, s3 중 가장 큰 수 구하고 그 수를 다시 s1,2,3 과 비교해 같은 경우를 찾아야함
        //Math.max 함수 이용
        int max = Math.max(Math.max(s1, s2), s3);

        //answer 배열에 새로운 것을 추가하려면 ArrayList 사용해야함
        ArrayList<Integer> temp = new ArrayList<>();

        //만약 max값과 정답개수 s가 일치한다면 가장 높은 점수를 받은 사람이 여럿이므로 배열에 추가
        if (max == s1) temp.add(1);
        if (max == s2) temp.add(2);
        if (max == s3) temp.add(3);

        //answer 배열은 크기가 지정되지 않았으므로 새로 초기화
        answer = new int[temp.size()];

        //추가된 ArrayList를 answer 배열로 옮겨줘야함
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }

        return answer;

    }

}