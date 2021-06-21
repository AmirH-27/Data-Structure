import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;int oddCount = 0;
        System.out.println("Enter the numbers : ");
        for(int i=0;i<10;i++){
            numbers[i]=sc.nextInt();
        }
        for(int j=0;j<10;j++){
            if(numbers[j]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("There are "+evenCount+" Numbers");
        System.out.println("There are "+oddCount+" Numbers");

    }
}
