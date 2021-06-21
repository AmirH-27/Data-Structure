import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prime,factorial = 1;

        System.out.println("Enter a prime number to find it's factorial : ");

        prime =sc.nextInt();

        for(int i=2;i<prime;i++){
            if(prime%i==0){
                System.out.println("!!!!Not a Prime Number!!!!");
                break;
            }
            else{
                for(int j=prime;j>0;j--){
                    factorial = factorial*j;
                }
                System.out.print("Factorial of "+prime+" is "+factorial);
                break;
            }
        }

    }
}
