import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("enter the number :");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        System.out.println("Given number is " + (isPalindrome(x)? "is a palindrome" : "is not a palindrome "));

    }

    public static boolean isPalindrome(int x) {

        boolean number = true;
        String b = String.valueOf(x);
        for(int i=0; i<b.length()/2; i++) {
            if (b.charAt(i) != b.charAt(b.length() - 1 - i)) {
                number = false;
                break;
            }
        }
        return number;

        /**
         * if (x < 0 || (x % 10 == 0 && x != 0)) {
         *             return false;
         *         }
         *
         *         int halfReverse = 0;
         *
         *         while (halfReverse < x) {
         *             halfReverse = (halfReverse * 10) + x % 10;
         *             x /= 10;
         *         }
         *
         *         return x == halfReverse || x == halfReverse / 10;
         */
    }
}
