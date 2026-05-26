import java.util.Scanner;

import static java.util.Collections.max;

public class HcfLcm {
    public static void main(String[] args) {

        System.out.println("enter two numbers a and b : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("a = " + a + " " + "b = " + b );

    // METHOD 1 : CHECKING ALL FACTORS
// a)
//        int hcf = 1;
//        going from 1 to 12
//        for(int i=1; i<= Math.min(a,b); i++){
//            if(a%i==0 && b%i==0) {
//                hcf = i;
//            }
//        }
// -----------------------------------------------------------
// b)
//        going from 12 to 1
//        for(int i=Math.min(a,b); i>= 1; i--){
//            if(a%i==0 && b%i==0) {
//                hcf = i;
//                break;
//            }
//        }

//        System.out.println("HCF is = " + hcf);
//        System.out.println("LCM is = " + ((a*b)/hcf));
// -----------------------------------------------------------
        // METHOD 2 : REPETITIVE SUBTRACTION
//        int x=a;
//        int y=b;
//        while(a!=b){
//            if(a>b){
//                a= a-b;
//            }
//            else {
//                b= b-a;
//            }
//        }
//        int hcf = a;
//
//        System.out.println("HCF is = " + hcf);
//        System.out.println("LCM is = " + ((x*y)/hcf));
//
// -----------------------------------------------------------
        // METHOD 3 : EUCLIDEAN ALGORITHM (BEST APPROACH O(lon(n))

        int x=a;
        int y=b;
        while(b!=0){
           int temp = b;
           b = a%b;
           a = temp;
        }
        int hcf = a;
        System.out.println("HCF is = " + hcf);
        System.out.println("LCM is = " + ((x*y)/hcf));
    }
}
