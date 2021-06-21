import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1,r2,c1,c2;
        System.out.println("Enter row size of Array 1: ");
        r1=sc.nextInt();
        System.out.println("Enter column size of Array 1: ");
        c1=sc.nextInt();
        System.out.println("Enter row size of Array 2: ");
        r2=sc.nextInt();
        System.out.println("Enter column size of Array 2: ");
        c2=sc.nextInt();

        int[][] array1 = new int[r1][c1];
        int[][] array2 = new int[r2][c2];
        int[][] prodArray = new int[r1][c2];

        if(c1==r2){
            System.out.println("Enter the elements of Array 1 row wise: ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    array1[i][j]= sc.nextInt();
                }
            }
            System.out.println("Enter the elements of Array 2 row wise: ");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    array2[i][j]= sc.nextInt();
                }
            }
            System.out.println("Matrix 1: ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    System.out.print(array1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Matrix 2: ");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(array2[i][j]+" ");
                }
                System.out.println();
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++) {
                        prodArray[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }
            System.out.println("Result Matrix: ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(prodArray[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Column of 1st array and row of 2nd array are not equal");
        }
    }
}