package codemate;

// 트리 순회
public class TreeTraversal {

    public static Node initTree() {
        Node root = new Node(1);
        
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        root.left = node2;
        root.right = node3;

        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node2.left = node4;
        node2.right = node5;

        return root;
    }

    /**
     * 전위 순회 함수
     */
    public static void preorder(Node node) {
        if (node == null) return;

        // 부모노드 -> 왼쪽자식노드 -> 오른쪽자식노드 순서로 탐색
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    /**
     * 중위 순회 함수
     */
    public static void inorder(Node node) {
        if (node == null) return;

        // 왼쪽 자식 노드부터 시작
        // 왼쪽자식노드 -> 부모노드 -> 오른쪽자식노드
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }

    /**
     * 후위 순회 함수
     */
    public static void postorder(Node node) {
        if (node == null) return;

        // 왼쪽자식노드 -> 오른쪽자식노드 -> 부모노드
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        Node root = initTree();

        preorder(root);
        // 1 -> 2 -> 4 -> 5 -> 3

        inorder(root);
        // 4 -> 2 -> 5 -> 1 -> 3

        postorder(root);
        // 4 -> 5 -> 2 -> 3 -> 1
    }
    
}
