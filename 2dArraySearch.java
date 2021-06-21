import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column, num, posI=0, posJ=0;


        System.out.print("Enter the number of rows : ");
        row=input.nextInt();

        System.out.print("Enter the number of colums : ");
        column=input.nextInt();

        int[][] array= new int[row][column];

        System.out.println("Enter the elements row wise : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j]=input.nextInt();
            }
        }

        System.out.println("Array");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter the Number you want to search : ");
        num=input.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(array[i][j]==num){
                    posI=i+1;
                    posJ=j+1;
                }
            }
        }
        System.out.print("Position of "+num+" is in "+"Row : "+posI+" , Column : "+posJ);

    }
}
