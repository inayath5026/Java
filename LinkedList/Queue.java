package LinkedList;

public class Queue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void pop() {
        if (head == null) {
            System.out.println("Queue is Empty!");
            return;
        }
        head = head.next;
        if (head == null) { 
            tail = null;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <- ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(10);
        q.push(20);
        q.push(30);

        q.printList();

        q.pop();
        q.printList(); 

        q.pop();
        q.pop();
        q.pop(); 
    }
}