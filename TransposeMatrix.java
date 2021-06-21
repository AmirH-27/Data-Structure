import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter row : ");
        int row = input.nextInt();
        System.out.println("Enter column : ");
        int column = input.nextInt();

        int[][] mat = new int[row][column];
        int[][] mat2 = new int[column][row];

        System.out.println("Enter the elements of Array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                mat2[i][j]=mat[j][i];
            }
        }
        System.out.println("Transpose Matrix : ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
