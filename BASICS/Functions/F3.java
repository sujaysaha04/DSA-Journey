package Functions;
import java.util.*;
public class F3 {
    public static int reverse(int n) {
        int rev=0;
        while(n>0) {
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n) {
        return reverse(n)==n;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isPalindrome(n)?"Palindrome":"Not Palindrome");
    }
}
