import java.util.Scanner;
public class Main {
    static void stack(){
        System.out.println("Static Stack");
        Task1 sta = new Task1();
        sta.push(2);
        sta.push(5);
        sta.push(7);
        sta.push(8);
        sta.push(1);

        sta.show();
        System.out.println();

        sta.pop();
        sta.show();
        System.out.println();

        sta.pop();
        sta.show();
        System.out.println();

        sta.pop();
        sta.show();
        System.out.println();

        sta.pop();
        sta.show();
        System.out.println();

        sta.pop();
        sta.show();
        System.out.println();
    }

    static void dynstack(){
        System.out.println("Dynamic Stack");
        Task2 dyn = new Task2();
        dyn.push(3);
        dyn.push(1);
        dyn.push(5);
        dyn.push(6);
        dyn.push(2);
        dyn.push(8);
        dyn.push(9);
        dyn.push(7);
        dyn.push(4);
        dyn.push(10);

        dyn.show();
        System.out.println();

        dyn.pop();
        dyn.show();
        System.out.println();

        dyn.pop();
        dyn.show();
        System.out.println();

        dyn.pop();
        dyn.show();
        System.out.println();

        dyn.pop();
        dyn.show();
        System.out.println();

        dyn.pop();
        dyn.show();

        System.out.println();
        dyn.pop();
        dyn.show();

        System.out.println();
        dyn.pop();
        dyn.show();

        System.out.println();
        dyn.pop();
        dyn.show();

        System.out.println();
        dyn.pop();
        dyn.show();

        System.out.println();
        dyn.pop();
        dyn.show();
        System.out.println();
    }

    static void queue(){
        System.out.println("Queue");
        Task3 que = new Task3();
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(2);
        que.enqueue(1);
        que.enqueue(5);

        que.show();
        System.out.println();

        que.Dequeue();
        que.show();
        System.out.println();

        que.Dequeue();
        que.show();
        System.out.println();

        que.Dequeue();
        que.show();
        System.out.println();

        que.Dequeue();
        que.show();
        System.out.println();

        que.Dequeue();
        que.show();
        System.out.println();

    }

    public static void main(String[] args) {

        stack();

        dynstack();

        queue();
    }
}
