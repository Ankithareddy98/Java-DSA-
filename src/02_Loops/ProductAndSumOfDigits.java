
/*  LEETCODE (EASY)
    1281. Subtract the Product and Sum of Digits of an Integer
 */
import java.util.Scanner;

public class ProductAndSumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer n = ");

        int n = input.nextInt();
        int sum=0;
        int prod = 1;

        while(n!=0){
            int a = n%10;
            sum += a;
            prod *= a;
            n = n/10;
        }

        int ans = prod - sum;
        System.out.println("Prodcut of digits subtracted with sum of digits is = " + ans );

    }
}
