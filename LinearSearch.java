import java.util.Scanner;
public class LinearSearch {
    class Node {
        int element;
        Node next;

        Node(int x) {
            element = x;
            next = null;
        }
    }
    Node head;
    public void insertF(int newElement){
        Node newNode = new Node(newElement);
        newNode.next = head;
        head = newNode;
    }
    public int searchL(int data){
        Node temp = head;
        int counter =0;
        while (temp != null){
            if (data==temp.element){
                counter++;
            }
            temp = temp.next;
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        LinearSearch x = new LinearSearch();

        System.out.print("Enter the number of elements : ");
        int size = z.nextInt();

        System.out.println("Enter the elements in the list : ");
        for(int i =0; i<size;i++){
            x.insertF(z.nextInt());
        }
        System.out.println("Enter the number you want to search : ");
        int a = x.searchL(z.nextInt());
        if(a!=0){
            System.out.println("Found !!");
        }
        else{
            System.out.println("Not Found !!");
        }

    }
}
