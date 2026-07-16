import java.util.LinkedList;
import java.util.Queue;

class Node {
    String data;
    Node left;
    Node right;

    Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class View {
    public static void LeftView(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node ele = q.poll();
                if (i == 0) {
                    System.out.print(ele.data + " ");
                }
                if (ele.left != null) {
                    q.offer(ele.left);
                }
                if (ele.right != null) {
                    q.offer(ele.right);
                }
            }
        }
    }

    public static void rightView(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node ele = q.poll();
                if (i == size - 1) {
                    System.out.print(ele.data + " ");
                }
                if (ele.left != null) {
                    q.offer(ele.left);
                }
                if (ele.right != null) {
                    q.offer(ele.right);
                }
            }
        }
    }

    

    public static void main(String[] args) {
        Node t1 = new Node("A");
        Node t2 = new Node("B");
        Node t3 = new Node("C");
        Node t4 = new Node("D");
        Node t5 = new Node("E");
        Node t6 = new Node("F");
        Node t7 = new Node("G");
        Node t8 = new Node("H");
        Node t9 = new Node("I");
        Node t10 = new Node("J");
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t4.left = t8;
        t4.right = t9;
        t5.left = t10;
        t5.right = null;
        t6.left = null;
        t6.right = null;
        t7.left = null;
        t7.right = null;
        LeftView(t1);
        System.out.println();
        rightView(t1);
        
    }
}
