import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("Enter integer");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(" Integer entered a = "  + a);

        String b = String.valueOf(a);
        System.out.println("printing b = " + b);
        int length = b.length();
        System.out.println("printing length of entered number a = " + length);

        int sum = 0;
        for(int i=0; i<length; i++){
            sum += (int) Math.pow((b.charAt(i) - '0') , length);
            System.out.println(sum);
        }

        if(a == sum){
            System.out.println("Armstrong Number");
        }
        else
            System.out.println("Not a Armstrong Number");

    }
}
