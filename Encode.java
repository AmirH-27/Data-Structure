import java.util.Scanner;
public class Task2{

    public static String encode(String str, int j){
        for(int i=j++;i<str.length();i+=j){
            str = str.substring(0,i)+(char)(str.charAt(i)+2)+str.substring(i+1);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Text : ");
        String s = input.nextLine();
        System.out.println("Enter shifting integer : ");
        int j = input.nextInt();
        System.out.println(encode(s,j));

    }
}
