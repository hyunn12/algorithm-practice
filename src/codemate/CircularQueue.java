package codemate;

// 원형 큐
public class CircularQueue {
    static int[] queue = new int[5];
    static int head = 0;
    static int tail = 0;

    static boolean isEmpty() {
        return head == tail;
    }

    static boolean isFull() {
        return tail >= queue.length -1;
    }

    static void enqueue(int item) {
        if (isFull()) {
            System.out.println("큐에 더이상 데이터를 넣을 수 없습니다.");
        }
        tail = (tail + 1) % queue.length;
        queue[tail] = item;
    }

    static int dequeue() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다.");
            return -1;
        }
        head = (head + 1) % queue.length;
        return queue[head];
    }

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        System.out.println("pop: " + dequeue());
        System.out.println("pop: " + dequeue());
        System.out.println("pop: " + dequeue());

        enqueue(4);
        enqueue(5);
        enqueue(6);
        System.out.println("pop: " + dequeue());
        System.out.println("pop: " + dequeue());
        System.out.println("pop: " + dequeue());

        enqueue(7);
        enqueue(8);
        enqueue(9);
        System.out.println("pop: " + dequeue());
        System.out.println("pop: " + dequeue());
        System.out.println("pop: " + dequeue());
    }

}
