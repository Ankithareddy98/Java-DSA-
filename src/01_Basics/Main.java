import java.util.Scanner;
import java.util.StringJoiner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("enter a integer");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("printing int " + a);

        String b = Integer.toString(a);
       // String b = String.valueOf(a);
        int n = b.length();
        for(int i=0; i<n/2; i++){
            if (b.charAt(i) == b.charAt(n-1)) {
                n--;
               // System.out.println("palindrome");
            }
            System.out.println("not a palindrome");
        }

    }
}