import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int id,credit;double cg;

        Student[] arr = new Student[10];

        for ( int i = 0; i <10; i++) {
            System.out.println("ENTER ID FOR Student : "+(i+1));
            id = x.nextInt();
            System.out.println("ENTER CREDIT FOR Student : "+(i+1));
            credit = x.nextInt();
            System.out.println("ENTER CG FOR Student : "+(i+1));
            cg = x.nextDouble();
            arr[i] = new Student(id,credit,cg);
        }

        System.out.println("Student's who has cgpa over 3.75 : ");

        for ( int i = 0; i <10; i++) {

            if(arr[i].getCg() > 3.75) {
                System.out.print(arr[i].getId()+" ");
            }
            if(arr[i].getCredit() > 50) {
                System.out.println(arr[i].getId()+" ");
            }
        }
    }
}