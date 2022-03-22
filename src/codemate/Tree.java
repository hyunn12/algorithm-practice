package codemate;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

// 트리
public class Tree {

    public static void main(String[] args) {

        Node root = new Node(1);

        Node node2 = new Node(2);
        Node node3 = new Node(3);

        root.left = node2;
        root.right = node3;

        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node2.left = node4;
        node2.right = node5;

        System.out.println(root.data);
        System.out.printf("%d %d\n", root.left.data ,root.right.data);
        System.out.printf("%d %d\n", root.left.left.data, root.left.right.data);

        /*
            1
           2 3
          4 5
        */
    }

}
