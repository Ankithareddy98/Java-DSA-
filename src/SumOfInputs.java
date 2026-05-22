import java.util.Scanner;

public class SumOfInputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum =0;

        while(true) {

            System.out.print("Enter number or x to stop: ");
            String val = input.next();
            if (val.equals("x")) {
                System.out.println("Entered x so ending the program!!");
                break;
            }
            int num = Integer.parseInt(val);
            sum += num;

            System.out.println("Sum of inputs = " + sum);

        }

    }
}
