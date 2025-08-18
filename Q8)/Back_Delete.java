import java.util.Scanner;

public class Back_Delete {
    private Node head;

    public Back_Delete() {
    }

    public void insertion(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void Nth_Delete_Back(int n) {
        if (head == null) {
            return;
        }
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int to_del = len - n;
        if (to_del < 0) {
            return;
        }

        if (to_del == 0) {
            head = head.next;
            return;
        }

        temp = head;
        int pos = 1;
        while (pos != to_del) {
            temp = temp.next;
            pos++;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Back_Delete list = new Back_Delete();
        list.insertion(1);
        list.insertion(2);
        list.insertion(3);
        list.insertion(4);
        list.insertion(5);
        list.display();
        System.out.println("Enter the node number to be deleted from back:");
        int n = sc.nextInt();
        list.Nth_Delete_Back(n);
        System.out.println("After deleting " + n + "th node from back:");
        list.display();
    }
}
