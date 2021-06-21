import java.util.Scanner;
class Task6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack s = new Stack();
        System.out.print("Enter the size of the stack : ");
        int size = input.nextInt();
        System.out.println("Enter the elements in the stack :  ");
        for(int i =0;i<size;i++) {
            System.out.print((i+1) +". ");
            s.push(input.nextInt());
        }
        int max=0, min = s.peek();
        for(int i=0;i<size;i++){
            if(s.peek()>max){
                max=s.pop();
            }
            else if(s.peek()<min){
                min=s.pop();
            }
        }
        System.out.print("Min: " + min + "\n");
        System.out.print("Max: " + max + "\n");
    }
}