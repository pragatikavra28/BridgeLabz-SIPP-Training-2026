import java.util.LinkedList;
import java.util.Queue;

class Node {
    char data;
    Node left;
    Node right;

     Node(char data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class TreeExample {
    public static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
   public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node ele = q.poll();
            System.out.print(ele.data + " ");

            if (ele.left != null)
                q.offer(ele.left);
            if (ele.right != null)
                q.offer(ele.right);
        }
    }
    public static void main(String[] args) {
        //0
        Node root = new Node('A');
        //1
        root.left = new Node('B');
        root.right = new Node('C');
        //2
        root.left.left = new Node('D');
        root.left.right = new Node('E');
        root.right.left = new Node('F');
        root.right.right = new Node('G');
        //3
        root.left.left.left = new Node('H');
        root.left.left.right = new Node('I');
        root.left.right.left = new Node('J');

        System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println("\nInorder Traversal:");
        inorder(root);
        System.out.println("\nPostorder Traversal:");
        postorder(root);
        System.out.println("\nLevel Order Traversal:");
         levelOrder(root);
    }
}