import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int counter =0,vow=0;

        System.out.print("Enter your word or sentence: ");
        String test = x.nextLine();

        char[] c = test.toCharArray();

        for(char j : c ) {
            if(j == ' '){
                continue;
            }
            else{
                counter++;
            }
            if(j == 'a' ||  j == 'e' || j == 'i' ||  j == 'o' || j == 'u') {
                vow++;
            }

        }
        int conso = counter-vow;

        System.out.println("Total number of letters: " + counter);
        System.out.println("Vowels: " + vow);
        System.out.println("Consonants: " + conso);


    }
}
