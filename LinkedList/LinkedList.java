package LinkedList;

public class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("List is Empty !!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (temp != null && i < idx - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Invalid Index");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public int removeFirst() {

        if (head == null) {
            System.out.println("List is Empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {

            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }

        int val = head.data;
        head = head.next;
        size--;

        return val;

    }

    public int removeLast() {

        if (size == 0) {

            System.out.println("List is Empty !");
            return Integer.MAX_VALUE;

        } else if (size == 1) {

            int val = tail.data;
            tail = head = null;
            size--;
            return val;

        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {

            temp = temp.next;

        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;

        return val;

    }

    public int Search(int key) {

        if (size == 0) {
            return -1;
        }

        Node temp = head;

        int i = 0;
        while (temp != null) {

            if (temp.data == key) {
                return i;
            }
            i++;

            temp = temp.next;

        }

        return -1;
    }

    public void reverse() {

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        head = prev;

    }

    public void findNandRemove(int n) {

        Node temp = head;
        int sz = 0;

        while (temp != null) {

            temp = temp.next;
            sz++;

        }

        if (sz - n == 0) {
            head = head.next;
            return;
        }

        Node prev = head;

        int prevIdx = sz - n;

        int i = 1;

        while (i < prevIdx) {

            prev = prev.next;
            i++;

        }

        prev.next = prev.next.next;
        return;

    }

    public boolean isCycle(){

        Node slow = head;
        Node fast = head;

        while(fast != null & fast.next != null){

            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if(slow == fast){
                return true;    // CYCLE DETECTED
            }

        }

        return false;

    }

    public boolean checkPalindrome() {

        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

        }

        Node mid = slow;

        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node left = head;
        Node right = prev;

        while (right != null) {

            if (right.data != left.data) {
                return false;
            }

            right = right.next;
            left = left.next;

        }

        return true;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(1);

        // ll.reverse();
        // ll.findNandRemove(2);
        ll.printLinkedList();

        System.out.println(ll.checkPalindrome());

        System.out.println("size : " + LinkedList.size);
    }
}
