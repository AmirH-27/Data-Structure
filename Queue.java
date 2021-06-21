public class Queue {
    private class Node {

        int data;
        Node next;
    }

    Node front; Node rear;

    public boolean isEmpty(){
        return front == null;
    }

    public int peakFront(){
        return front.data;
    }
    public int peakRear(){
        return rear.data;
    }

    public void enqueue(int elm){
        Node temp = new Node();
        temp.data = elm;

        if(rear!=null) {
            rear.next = temp;
        }
        rear = temp;
        if(front==null) {
            front = temp;
        }
    }

    public int dequeue(){
        int data = front.data;
        front = front.next;
        if (front==null)
        {
            rear = null;
        }
        return data;
    }

    public void  show(){
        Node temp = front;
        while (temp != null) {

            System.out.print(temp.data+" ");


            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(3);
        queue.enqueue(9);
        queue.enqueue(7);

        System.out.print("Queue : ");
        queue.show();
        queue.dequeue();

        System.out.println();
        System.out.println("FRONT : "+queue.peakFront());

        queue.enqueue(37);
        queue.enqueue(5);

        System.out.print("Queue : ");
        queue.show();

        queue.dequeue();

        System.out.println();
        System.out.println("Front : "+queue.peakFront());
        System.out.println("Rear : "+queue.peakRear());

    }


}
