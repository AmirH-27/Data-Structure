import java.util.Scanner;
public class DoublyLinkedList {
    Node head;
    class Node {
        int data;
        Node prev;
        Node next;
        Node(int d) {
            data = d;
        }
    }
    public void insertFront(int element){
        Node newNode = new Node(element);

        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }
    public void insertEnd(int element){
        Node newNode = new Node(element);

        Node last = head;
        newNode.next = null;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }
    public void printlist(Node y) {
        Node last = null;
        System.out.print("Traversal in forward Direction : ");
        while (y != null) {
            System.out.print(y.data +" ");
            last = y;
            y = y.next;
        }
        System.out.println();
        System.out.print("Traversal in reverse direction : ");
        while (last != null) {
            System.out.print(last.data +" ");
            last = last.prev;
        }
        System.out.println();
        System.out.println();
    }
    void deleteNode(Node delete){
        if (head == delete) {
            head = delete.next;
        }
        if (delete.next != null) {
            delete.next.prev = delete.prev;
        }
        if (delete.prev != null) {
            delete.prev.next = delete.next;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoublyLinkedList dl = new DoublyLinkedList();
        int size;

        System.out.print("Enter the number of elements in the list : ");
        size=input.nextInt();

        System.out.println("Enter the elements : ");
        for(int i=0;i<size;i++){
            dl.insertFront(input.nextInt());
        }
        System.out.println();
        dl.printlist(dl.head);

        dl.deleteNode(dl.head);

        System.out.println("After deleting the first element");
        System.out.println();
        dl.printlist(dl.head);
    }
}
