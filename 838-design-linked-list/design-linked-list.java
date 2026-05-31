class MyLinkedList {

    Node head;
    Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    public int get(int index) {

        if(index < 0)
            return -1;

        Node temp = head;

        for(int i = 0; i < index; i++) {
            if(temp == null)
                return -1;

            temp = temp.next;
        }

        return temp == null ? -1 : temp.data;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addAtTail(int val) {

        Node newNode = new Node(val);

        if(tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addAtIndex(int index, int val) {

        if(index < 0)
            return;

        if(index == 0) {
            addAtHead(val);
            return;
        }

        Node temp = head;
        Node prev = null;

        for(int i = 0; i < index; i++) {

            if(temp == null)
                return;

            prev = temp;
            temp = temp.next;
        }

        if(temp == null) {
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);

        newNode.prev = prev;
        newNode.next = temp;

        prev.next = newNode;
        temp.prev = newNode;
    }

    public void deleteAtIndex(int index) {

        if(index < 0 || head == null)
            return;

        Node temp = head;
        Node prev = null;

        if(index == 0) {

            head = head.next;

            if(head != null)
                head.prev = null;
            else
                tail = null;

            return;
        }

        for(int i = 0; i < index; i++) {

            if(temp == null)
                return;

            prev = temp;
            temp = temp.next;
        }

        if(temp == null)
            return;

        prev.next = temp.next;

        if(temp.next == null) {
            tail = prev;
        } else {
            temp.next.prev = prev;
        }
    }
}