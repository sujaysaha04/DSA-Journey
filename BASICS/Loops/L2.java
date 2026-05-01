package Loops;
import java.util.*;
public class L2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sumEven=0,sumOdd=0;
        char ch;
        do { 
            int n=in.nextInt();
            if(n%2==0) {
                sumEven+=n;
            } else {
                sumOdd+=n;
            }
            System.out.println("Do you want to continue 'Y' for yes , 'N' for no:");
            ch=in.next().charAt(0);
        } while (ch=='Y');
        System.out.println("Sum of Odd Integer:"+sumOdd);
        System.out.println("Sum of Even Integer"+sumEven);
    }
}
