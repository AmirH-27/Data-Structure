import java.util.Scanner;

public class Selectionsort {
    static void SelectionAscending(int[] array, int size){
        for(int j=0;j<size;j++) {
            System.out.print("Step-"+j+": ");
            for(int k=0;k<size;k++){
                System.out.print(array[k]+" ");
            }
            System.out.println();
            int temp = j;
            for (int i = j+1; i<size; i++) {
                if (array[i] < array[temp]) {
                    temp = i;
                }
            }
            int min=array[temp];
            array[temp]=array[j];
            array[j]=min;
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
        System.out.println("Selection sort Ascending : ");
        SelectionAscending(array, size);
    }
}
