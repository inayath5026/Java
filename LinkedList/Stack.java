package LinkedList;

public class Stack {

    class Node{

        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }

    public Node top;

    public void push(int data){

        Node newNode = new Node(data);

        if(top == null){

            newNode.prev = null;
            newNode.next = null;
            top = newNode;

            return;

        }

        top.next = newNode;
        newNode.prev = top;
        newNode.next = null;
        top = newNode;

    }

    public void pop(){

        if(top == null){
            System.out.println("Stack is Empty");
            return;
        } 

        if(top.prev == null){
            top = top.prev = top.next = null;
            return;
        }

        top = top.prev;
        top.prev = top.prev;

    }

    public void printList(){

        if(top == null){
            System.out.println("Stack is Empty");
            return;
        }

        Node temp=top;

        while(temp!= null){

            System.out.println(temp.data);
            temp = temp.prev;

        }

    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();

        s.printList();
    }

}
