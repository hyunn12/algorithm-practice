package codemate;

public class StackPop {

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

    public static boolean isEmpty() {
        return top < 0;
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("스택이 비었습니다.");
            return 0;
        } else {
            return stack[top--];
        }
    }

    public static void main(String[] args) {
        pop();
        push(3);
        push(5);
        System.out.println("pop: " + pop());
        System.out.println("pop: " + pop());
        System.out.println("pop: " + pop());
    }

}
