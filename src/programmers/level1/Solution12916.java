package programmers.level1;

// 문자열 내 p와 y의 개수
public class Solution12916 {

    public static void main(String[] args) {
//        String s = "pPoooyY";
        String s = "pPoooyy";
//        System.out.println(solution_1(s));
//        System.out.println(solution_2(s));
        System.out.println(solution_3(s));
    }

    // 방법1. 단순 반복문으로 count++ 해서 값 비교
    static boolean solution_1(String s) {
        // 각각 p의 개수, y의 개수를 셀 count 선언
        int pCnt = 0;
        int yCnt = 0;

        // 문자열 s를 char배열로 변환
        char[] temp = s.toCharArray();

        // 단순 반복문을 통해 각 문자가 p나 y라면 각 문자의 count 증가하도록 함
        for (int i = 0; i < s.length(); i++) {
            if (temp[i] == 'p' || temp[i] == 'P') pCnt++;
            if (temp[i] == 'y' || temp[i] == 'Y') yCnt++;
        }
        // 두 count를 비교한 결과가 boolean값이므로 바로 반환
        return pCnt == yCnt;
    }

    // 방법2. 단순반복문2 - 전부 소문자로 만들어 비교
    static boolean solution_2(String s) {
        int pCnt = 0;
        int yCnt = 0;

        // toLowerCase를 이용해 전부 소문자로 만들어 대문자도 포함해 count셀 필요없도록 함
        s = s.toLowerCase();
        char[] temp = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (temp[i] == 'p') pCnt++;
            if (temp[i] == 'y') yCnt++;
        }

        return pCnt == yCnt;
    }

    // 방법3. stream filter 비교
    static boolean solution_3(String s) {
        s = s.toLowerCase();
        // String.chars.filter.count를 비교한 값을 리턴
        // 간단해보이긴 하지만 stream을 두번 돌아서 속도가 많이 느려지긴함 고민...
        return s.chars().filter(c -> c == 'p').count() == s.chars().filter(c -> c =='y').count();
    }

}