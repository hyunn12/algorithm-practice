package codemate;

// 선형 큐
public class Queue {

    static int[] queue = new int[3];
    static int head = -1;  // 가장 오래된 데이터 위치
    static int tail = -1;  // 최근 추가된 데이터 위치

    static boolean isEmpty() {
        return head == tail;
    }

    static boolean isFull() {
        return tail >= queue.length -1;
    }

    static void enqueue(int item) {
        if (isFull()) {
            System.out.println("큐에 더이상 데이터를 넣을 수 없습니다.");
        } else {
            queue[++tail] = item;
        }
    }

    static int dequeue() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다.");
            return 0;
        } else {
            return queue[++head];
        }
    }

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        System.out.println("pop: " + dequeue());
        System.out.println("pop: " + dequeue());
        System.out.println("pop: " + dequeue());

        enqueue(1);
        enqueue(2);
    }

}
