package Functions;
import java.util.*;
public class F2 {
    public static boolean isEven(int n) {
        return n%2==0;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isEven(n)?"Even":"Odd"); 
    }
}
