//A program to count the frequency of each element of an array
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int a;
        int counter=0,number;

        Scanner x = new Scanner(System.in);

        System.out.println("Enter the size of the Array : ");

        a = x.nextInt();

        int[] arr = new int[a];

        System.out.println("Enter the elements of array");

        for(int i=0;i<a;i++){
            arr[i]=x.nextInt();
        }

        System.out.print("Elements in Array : ");
        for(int j=0;j<a;j++) {
            System.out.print(arr[j] + "  ");
        }
        System.out.println();

        for(int i =0; i < a; i++) {
            number = arr[i];
            for(int j=0;j<a;j++){
                if(number==arr[j]){
                    counter++;
                }
            }
            System.out.println((i+1)+". "+number+" occures "+counter+" times");
            counter = 0;
        }
    }
}