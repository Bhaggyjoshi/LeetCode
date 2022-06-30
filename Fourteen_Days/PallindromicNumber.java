import java.util.Scanner;

/**
 * PallindromicNumber
 */
public class PallindromicNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp, sum =0;

        temp = n;
        while (n>0) {
            int r = n%10;
            sum = (sum*10)+r;                                              
            n/=10;

        }
        if (temp == sum) {
            System.out.println("pallindromin number");
        }else{
            System.out.println("Not pallindromic Number");
        }
        scn.close();
    }
}