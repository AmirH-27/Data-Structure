import java.util.Scanner;
public class SinglyLinkedList {
    class Node {
        int element;
        Node next;
        Node(int x) {
            element = x;
            next = null;
        }
    }
    Node head;
    public void insertFront(int newElement){
        Node newNode = new Node(newElement);
        newNode.next = head;
        head = newNode;
    }
    public void insertAfter(Node preNode, int newElement){
        if (preNode == null) {
            System.out.println("Previous node is null, so cannot insert");
            return;
        }
        Node newNode = new Node(newElement);
        newNode.next = preNode.next;
        preNode.next = newNode;
    }
    public void insertEnd(int newElement) {
        Node newNode = new Node(newElement);
        if (head == null) {
            head = new Node(newElement);
            return;
        }
        newNode.next = null;
        Node end = head;
        while (end.next != null) {
            end = end.next;
        }
        end.next = newNode;
    }
    public void printList(){
        Node data = head;
        while (data != null)
        {
            System.out.print(data.element+" ");
            data = data.next;
        }

    }
    public void DeleteElement(int del){
        Node temp = head;
        Node pre = null;
        if (temp != null && temp.element == del) {
            head = temp.next;
            return;
        }
        if(temp.element != del){
            System.out.println("Element not found ");
        }
        while (temp != null && temp.element != del) {
            pre = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        pre.next = temp.next;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinglyLinkedList li = new SinglyLinkedList();
        int size, option;
        System.out.println("1. Insert Front"+"\n"+"2. Insert After"+"\n"+"3.Insert End");
        System.out.print("Enter yout option : ");
        option=input.nextInt();
        if(option==1){

        }
    }
}

