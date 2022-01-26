package baekjoon.bruteforce;

//피로도
import java.util.Scanner;

public class Main22864 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //차례로 A, B, C, M 이 입력됨
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int m = scanner.nextInt();

        int answer = work(a,b,c,m);


        scanner.close();

    }

    public static int work(int a, int b, int c, int m) {

        //1시간 일 -> 피로도 +A / 일한 양 B
        //1시간 휴식 -> 피로도 -C (단, 피로도는 최소 0)
        //최대 피로도를 M이 넘지 않도록 할 때, 24시간 하루에 최대 일을 얼마나 할 수 있는지

        //일한 시간 workTime
        int workTime = 0;

        //피로도
        int tiredness = 0;

        //일한 양
        int output = 0;

        //단, tiredness는 최대 M
        while (tiredness <= m) {

            workTime++;

            tiredness += a;

            output += b;

        }

        System.out.println(workTime);
        System.out.println(tiredness);
        System.out.println(output);





        return 0;

    }


}
