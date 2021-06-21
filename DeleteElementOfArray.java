//A program to delete an element at desired position from an array
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        System.out.print("Elements in the array: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("Enter position you want to delete:");

        int delPosition = sc.nextInt();

        for(int i = delPosition-1; i < n - 1; i++) {
            array[i] = array[i + 1];
        }

        System.out.println("Element deleted from position: "+(delPosition+1));

        System.out.println("New Array:  ");
        for(int i=0;i<n-1;i++){
            System.out.print(array[i]+" ");
        }
    }
}

