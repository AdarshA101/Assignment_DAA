public class Loop_Linkedlist {
    private Node head;

    public Loop_Linkedlist() {
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

    public int is_Loop() {
        Node prev = head;
        Node curr = head;

        while (curr != null && curr.next != null) {
            prev = prev.next;
            curr = curr.next.next;

            if (prev == curr) {
                return 1;
            }
        }
        return 0;
    }

    public void Loop_Formation(int pos) {
        if (head == null || pos <= 0) {
            return;
        }
        Node temp1 = head;
        for (int i = 1; i < pos; i++) {
            if (temp1 != null) {
                temp1 = temp1.next;
            }
        }
        if (temp1 == null) {
            return;
        }
        Node temp2 = head;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = temp1;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Loop_Linkedlist LL = new Loop_Linkedlist();
        LL.insertion(1);
        LL.insertion(2);
        LL.insertion(3);
        LL.insertion(4);
        LL.insertion(5);

        LL.Loop_Formation(1);

        if (LL.is_Loop() == 1) {
            System.out.println("Loop is there!");
        } else {
            System.out.println("No Loop!!");
        }
    }
}
