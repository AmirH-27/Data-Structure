public class Task1 {
    int stack[] = new int[5];
    int top=0;

    public void push(int elm){
        if(top == 5){
            System.out.println("stack is full");
        }
        else {
            stack[top] = elm;
            top++;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }

        else {
            int data;
            top--;
            data = stack[top];
            stack[top] = 0;

            return data;
        }
        return 0;
    }

    public boolean isEmpty(){
        return top<=0;

    }

    public int size(){
        return top;
    }

    public void show() {
        for(int i: stack) {
            System.out.print(i + " ");
        }
    }
}

