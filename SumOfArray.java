//A program to find the sum of all elements of the array
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        int sum=0;
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Elements in the array: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Sum of the elements in the array = ");
        for(int i=0;i<n;i++){
            sum += array[i];
        }
        System.out.println(sum);
    }
}
