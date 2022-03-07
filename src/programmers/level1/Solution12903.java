package programmers.level1;

// 가운데 글자 가져오기
public class Solution12903 {

    public static void main(String[] args) {
//        String s = "abcde";
        String s = "qwer";
        System.out.println(solution_1(s));
        System.out.println(solution_2(s));
    }

    // 방법1. split 후 StringBuilder에 할당
    public static String solution_1(String s) {
        // 길이가 3이면 중간은 index=1
        //      1 = round(3/2)-1 // (3-1)/2  // 3/2
        // 길이가 4면 중간 두개는 index 1,2
        //      1,2 = round(4/2)-1. round(4/2)-1+1  // (4-1)/2, 4/2
        // 기준 = 3/2
//        int mid = (int) Math.round((double) s.length() / 2) - 1;
        int mid = (s.length()-1) / 2 - 1;

        String[] temp = s.split("");

        StringBuilder sb = new StringBuilder();
        sb.append(temp[mid]);

        if (s.length() % 2 == 0) sb.append(temp[mid+1]);

        return sb.toString();
    }

    // 방법2. substring 이용
    public static String solution_2(String s) {
        // 홀수일 때 중간단어의 index가 (s.length-1)/2 와 같고
        // 짝수일 땐 (s.length-1)/2 부터 (s.length-1)/2 + 1인데
        // 짝수의 경우 (s.length-1)/2 + 1 = s.length/2
        // 왜냐면 int는 소수점을 버려버리기때문에
        // 같은 이유로 홀수의 경우 (s.length()-1)/2 = s.length/2
        // 그래서 substring이 아래와 같이 작성됨
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}
