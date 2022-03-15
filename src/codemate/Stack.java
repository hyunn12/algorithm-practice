package codemate;

public class Stack {
    private final int MAX_STACK_SIZE = 3;
    private int top = -1;
    private int[] arr;

    public Stack() {
        this.arr = new int[this.MAX_STACK_SIZE];
    }

    public boolean isFull() {
        return this.top >= this.MAX_STACK_SIZE - 1;
    }

    public boolean isEmpty() {
        return this.top < 0;
    }

    public void push(int value) {
        if (this.isFull()) {
            System.out.println("스택이 가득 찼습니다.");
        } else {
            this.arr[++this.top] = value;
        }
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("스택이 비었습니다.");
            return -1;
        } else {
            return this.arr[this.top--];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.pop();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("pop : " + stack.pop());
        System.out.println("pop : " + stack.pop());
        System.out.println("pop : " + stack.pop());
        System.out.println("pop : " + stack.pop());
    }

}
