package programmers.stackqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public int[] solution(int[] progresses, int[] speeds) {

        int[] answer = {};

        //작업 담을 Queue 선언
        Queue<Integer> queue = new LinkedList<>();

        //작업 끝내는데에 걸리는 날짜 계산
        for(int i = 0 ; i < progresses.length; i++ ){

            //ceil 이용해서 올림으로 날짜 계산
            int day = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);

            //offer: queue에 day 추가
            queue.offer(day);
        }

        //결과 담을 list 선언
        List<Integer> result = new ArrayList<>();

        while( !queue.isEmpty() ){
            //배포 가능한 개수 셀 cnt 선언
            int cnt = 1;

            //poll: 가장 먼저 보관한 값 꺼내고 반환
            //
            int value = queue.poll();

            //처음 꺼낸 배포 작업일이 다음 작업일 보다 크다면 배포 가능 개수 플러스
            //peek: 가장 먼저 보관한 값 단순 참조, 꺼내지 않음

            //만약 queue가 empty가 아니면서(배포할 것이 남음) &&
            while( !queue.isEmpty() && value >= queue.peek()){

                queue.poll();

                cnt++;
            }

            result.add(cnt);
        }

        answer = new int[result.size()];

        for ( int i = 0 ; i < answer.length; i++ ) {
            answer[i] = result.get(i);
        }

        return answer;
    }

}


/*
 Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            if (!q.isEmpty() && q.peek() < date) {
                answerList.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
 */