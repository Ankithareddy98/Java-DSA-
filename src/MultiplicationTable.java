import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("enter the number for which you want the multiplication table : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(a + "*" + i + "=" + a*i);
        }
    }
}
