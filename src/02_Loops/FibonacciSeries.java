import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        System.out.println("Enter the number of terms : n=");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;

//        for(int i=1; i<=n; i++){
//            System.out.print(a + " ");
//            int s = a+b;
//            a = b;
//            b = s;
        int i=1;
        int s =0;
        while(i<=n){
            System.out.println(a);
            s= a+b;
            a=b;
            b=s;
            i++;
        }

        System.out.println(n + "th " + "fibonacci number is " + a);

    }
}
