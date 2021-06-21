//a program to print all unique elements in an array
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        int size,counter=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        size = input.nextInt();
        boolean a = true;

        int[] arr = new int[size];

        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.print("Elements in Array : ");
        for(int j=0;j<size;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.print("Unique Array : ");
        for(int i=0;i<size;i++){
            int j;
            for(j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    counter++;
                    a = false;
                    break;
                }
            }
            if(i==j){
                System.out.print(" "+arr[j]);
            }
        }
        System.out.println();
        if(a){
            System.out.println("Array is unique");
        }

    }
}
