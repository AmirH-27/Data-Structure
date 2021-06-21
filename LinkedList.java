import java.util.Scanner;
public class Task3 {
    class Node {
        int element;
        Node next;
        Node(int x) {
            element = x;
            next = null;
        }
    }
    Node head;
    public void insertFront(int newElement) {
        Node newNode = new Node(newElement);
        newNode.next = head;
        head = newNode;
    }
    public void show() {
        Node data = head;
        while (data != null) {
            System.out.print(data.element + " ");
            data = data.next;
        }
    }
    public Node reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        Task3 sll = new Task3();

        System.out.print("Enter thew number of elements : ");
        int size = z.nextInt();

        System.out.println("Enter the elements at the front : ");
        for(int i =0; i<size;i++){
            sll.insertFront(z.nextInt());
        }
        System.out.print("Link list in normal order : ");
        sll.show();
        System.out.println();
        System.out.print("Link list in reverse order : ");
        sll.reverse();
        sll.show();
    }

}
