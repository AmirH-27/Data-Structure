import java.util.Scanner;
public class Stack {

    private class Node {
        int data;
        Node next;
    }
    Node top;
    Stack(){
        this.top=null;
    }
    public void push(int x) {
        Node temp = new Node();
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.data = x;
        temp.next = top;
        top = temp;
    }
    public boolean isEmpty()
    {
        return top == null;
    }
    public int peek () {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public int pop(){
        if (top == null) {
            System.out.print("\nStack Underflow");
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    public void show() {
        if (top == null) {
            System.out.print("\nStack Underflow");
        }
        else {
            Node temp = top;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(3);
        stack.push(9);
        stack.push(7);

        System.out.print("Stack : ");
        stack.show();

        stack.pop();
        stack.pop();

        System.out.println();
        System.out.println("Top : "+stack.peek());

        stack.push(37);
        stack.push(5);

        System.out.print("Stack : ");
        stack.show();

        stack.pop();

        System.out.println();
        System.out.println("Top : "+stack.peek());
    }
}

