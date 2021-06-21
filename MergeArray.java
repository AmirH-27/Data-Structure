import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        int size1,size2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of 1st Array : ");
        size1=input.nextInt();
        System.out.println();
        System.out.print("Enter the size of 2nd Array : ");
        size2=input.nextInt();
        System.out.println();
        int counter=0;

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] arr3 = new int[size1+size2];

        for(int i=0;i<size1;i++){
            arr1[i]=input.nextInt();
            arr3[counter]=arr1[i];
            counter++;
        }
        System.out.print("1st Array : ");
        for(int i=0;i<size1;i++){
            System.out.print("  "+arr1[i]);
        }
        System.out.println();
        for(int i=0;i<size2;i++){
            arr2[i]=input.nextInt();
            arr3[counter]=arr2[i];
            counter++;
        }
        System.out.print("2nd Array : ");
        for(int i=0;i<size2;i++){
            System.out.print("  "+arr2[i]);
        }
        System.out.println();
        System.out.print("Merged Array : ");
        for(int i=0;i<counter;i++){
            System.out.print("  "+arr3[i]);
        }
        System.out.println();
        System.out.print("Merged Array in reverse : ");
        for(int i=size1+size2-1;i>=0;i--){
            System.out.print("  "+arr3[i]);
        }

    }
}
