package Functions;
import java.util.*;
public class BTD {
    public static int convertBTD(int n) {
        int sum=0,power=0;
        while(n>0) {
            sum+=(int)Math.pow(2,power++)*(n%10);
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Decimal value :"+convertBTD(n));
    }
}
