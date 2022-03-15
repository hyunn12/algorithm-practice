package codemate;

// 스택 데이터 삽입
public class StackPush {

    static int max_size = 3;
    static int[] stack = new int[max_size];
    static int top = -1;

    public static boolean isFull() {
        return top >= max_size - 1;
    }

    public static void push(int value) {
        if (isFull()) {
            System.out.println("스택이 가득 찼습니다.");
        } else {
            System.out.println(value + " 삽입 완료");
            stack[++top] = value;
        }
    }

    public static void main(String[] args) {
        push(3);
        push(5);
        push(12);
        push(7);
        push(1);
    }

}
