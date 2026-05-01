package Functions;
import java.util.*;
public class F5 {
    public static int sumDigit(int n) {
        int sum=0;
        for(int i=n;i>0;i/=10) {
            sum=sum+(i%10);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Sum of digits:"+sumDigit(n));
    }
}
