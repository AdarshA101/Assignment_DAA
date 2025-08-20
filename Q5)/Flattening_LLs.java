import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node next;
    Node child;

    Node() {
        this.data = 0;
        this.next = null;
        this.child = null;
    }

    Node(int x) {
        this.data = x;
        next = null;
        child = null;
    }

    Node(int x, Node nextnode, Node childnode) {
        data = x;
        next = nextnode;
        child = childnode;
    }
}

public class Flattening_LLs {

    static Node Convert(ArrayList<Integer> arr) {
        Node head = new Node(arr.get(0));
        Node temp = head;
        for (int i = 1; i < arr.size(); i++) {
            temp.child = new Node(arr.get(i));
            temp = temp.child;
        }
        return head;
    }

    static Node flattening_LinkedList(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            Node temp = head;
            while (temp != null) {
                arr.add(temp.data);
                temp = temp.child;
            }
            head = head.next;
        }
        Collections.sort(arr);
        return Convert(arr);
    }

    static void Display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.child = new Node(3);

        head.next = new Node(2);
        head.next.child = new Node(4);

        head.next.next = new Node(7);
        head.next.next.child = new Node(5);
        head.next.next.child.child = new Node(6);

        head.next.next.next = new Node(9);
        head.next.next.next.child = new Node(8);

        Node to_flat = flattening_LinkedList(head);
        System.out.println("Flattened linked list: ");
        Display(to_flat);
    }
}
