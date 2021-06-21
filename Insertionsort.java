import java.util.Scanner;

public class Insertionsort {
    static void InsertionSort(int[] array,int size) {
        for (int i = 0; i < size; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j>=0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
            System.out.print("Step-"+i+": ");
            for(int k=0;k<size;k++){
                System.out.print(array[k]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the Array : ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Insertion sort Ascending : ");
        InsertionSort(array, size);
    }

}
