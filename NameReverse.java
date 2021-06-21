import java.util.Scanner;
public class Homework{
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name to reverse ");
        name=input.nextLine();

        String arrName[]=name.split("");

        String revArrName[] = new String[arrName.length];

        for(int i=0;i<arrName.length;i++){
            System.out.print(arrName[i]+"  ");
        }
        System.out.println();

        int j=0;
        for (int i = arrName.length - 1; i >= 0; i--) {
            revArrName[j]=arrName[i];
            j++;
            //System.out.print(revArrName[j]+"  ");
        }
        for(int k=0;k<revArrName.length;k++){
            System.out.print(revArrName[k]+"  ");
        }
    }
}

