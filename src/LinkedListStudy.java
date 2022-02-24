public class LinkedListStudy {
    public static void main(String[] args) {
        LinkedList head = new LinkedList();
        head.append(1);
        head.append(2);
        head.append(3);
        head.append(2);
        head.retrieve();
        head.removeDups();
        head.retrieve();
    }
}

class LinkedList {
    Node header;

    static class Node {
        int data;
        Node next = null;
    }

    void retrieve() {
        Node n = header.next;

        while(n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);

    }

    void append(int d) {
        Node end = new Node();
        end.data = d;
        Node n = header;

        while (n.next != null) {
            n = n.next;
        }

        n.next = end;
    }

    void delete(int d) {
        Node n = header;

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void removeDups() {
        Node n = header;

        while (n.next != null) {
            Node r = n;
            while (r.next != null) {
                if (n.data == r.next.data) {
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
            n = n.next;
        }
    }

    LinkedList() {
        header = new Node();
    }
}


