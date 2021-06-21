import java.util.Scanner;
public class Bubblesort {
    static void BubbleAscending(int[] array, int size){
        for(int j=0;j<size;j++) {
            System.out.print("Step-"+j+": ");
            for(int k=0;k<size;k++){
                System.out.print(array[k]+" ");
            }
            System.out.println();
            for (int i = 0; i < size - j - 1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        System.out.println("------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = input.nextInt();
        int[] array =new int[size];
        System.out.println("Enter the elements of the Array : ");
        for(int i=0;i<size;i++){
            array[i]=input.nextInt();
        }
        System.out.println("Array : ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Bubble Sort Ascending: ");
        BubbleAscending(array,size);
    }
}

