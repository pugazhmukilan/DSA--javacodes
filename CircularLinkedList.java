public class CircularLinkedList {
    public static void main(String[] args) {
        Circular l = new Circular();
        l.insertAtBegin(90);
        l.insertAtBegin(91);
        l.insertAtEnd(100);
        l.display();
        l.insertAtMiddle(2, 45874);
        l.display();
    }
}

class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Circular {
    node start;

    public Circular() {
        this.start = null;
    }

    void insertAtBegin(int n) {
        node temp = new node(n);
        if (start == null) {
            temp.next = temp; // For a circular list, when it's the first node, it should point to itself.
            start = temp;
        } else {
            temp.next = start;
            node p = start;
            while (p.next != start) {
                p = p.next;
            }
            p.next = temp;
            start = temp;
        }
    }

    void insertAtEnd(int n) {
        
        node p = start;
        node temp = new node(n);

        while (p.next != start) {
            p = p.next;
        }
        temp.next = start;
        p.next = temp;
    }

    void insertAtMiddle(int loc, int n) {
        node p = start;
        node temp = new node(n);
        for (int i = 0; i < loc - 2; i++) {
            p = p.next;
        }
        temp.next = p.next;
        p.next = temp;
    }

    void deleteAtBegin() {
        node p = start;
        node q = p.next;
        start = q.next;
    }

    void deleteAtEnd() {
        node p = start;
        while (p.next != start) {
            p = p.next;
        }
        p.next = start;
    }

    void deleteAtMiddle(int loc) {
        node p = start;
        for (int i = 0; i < loc - 2; i++) {
            p = p.next;
        }
        node q = p.next;
        p.next = q.next;
    }

    void display() {
        node p = start;
        do {
            System.out.println(p.data + " " + p.next);
            p = p.next;
        } while (p != start);
    }
}
