package codemate;

class Node {
    public Object data;
    public Node pointer;

    public Node(Object input) {
        this.data = input;
        this.pointer = null;
    }
}

public class LinkedList {

    private Node head = new Node(null);

    /**
     * head 부터 index 위치까지 존재하는 모든 노드 리턴
     */
    public Node get(int index) {
        Node node = this.head.pointer;

        while (true) {
            if (index == 0) return node;

            if (node == null) {
                System.out.println("Index Error");
                return null;
            }
            node = node.pointer;
            index--;
        }
    }

    /**
     * 링크드리스트 마지막 노드에 새로운 노드 추가
     */
    public void append(int data) {
        Node node = head;
        Node newNode = new Node(data);

        // 마지막 요소까지 탐색
        while (true) {
            if (node.pointer == null) {
                break;
            }
            node = node.pointer;
        }
        node.pointer = newNode;
    }

    /**
     * 링크드리스트에서 인덱스 위치에 새로운 노드 추가
     */
    public void insert(int data, int index) {
        Node node = head;
        // 새로운 노드 설정
        Node newNode = new Node(data);

        // 무한반복문 통해 인덱스 위치까지 쭉 내려감
        while(true) {
            // 현재 노드가 null 이면, 링크드리스트 사이즈보다 큰 인덱스값이 들어온 것
            if (node == null) {
                System.out.println("Index Error");
                return;
            }

            // 인덱스가 0이면 해당 위치에 새로운 노드 삽입
            if (index == 0) {
                Node nextNode = node.pointer;
                node.pointer = newNode;
                newNode.pointer = nextNode;
                break;
            }

            //인덱스가 0이 아니면 노드를 타고 내려감
            node = node.pointer;
            index--;
        }
    }

    /**
     * 링크드리스트의 인덱스 위치에 존재하는 모든 노드 제거
     */
    void delete(int index) {
        if (index == 0) {
            head.pointer = head.pointer.pointer;
        } else {
            // get 이용해 인덱스 위치의 데이터 얻어옴
            Node node = get(index - 1);
            node.pointer = node.pointer.pointer;
        }
    }

    void printLinkedList() {
        Node node = head.pointer;

        while (node != null) {
            if (node.pointer != null) {
                System.out.print(node.data + " -> ");
            } else {
                System.out.print(node.data);
            }
            node = node.pointer;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.printLinkedList();
        // 1 -> 2 -> 3

        ll.insert(10, 0);
        ll.printLinkedList();
        // 10 -> 1 -> 2 -> 3

        ll.insert(20, 3);
        ll.printLinkedList();
        // 10 -> 1[=index1] -> 2 -> 20 -> 3

        ll.delete(1);
        ll.printLinkedList();
        // 10[=index0] -> 2 -> 20 -> 3

        ll.delete(0);
        ll.printLinkedList();
        // 2 -> 20 -> 3
    }

}

