package Functions;
import java.util.*;
public class DTB {
    public static int convertDTB(int n) {
        int num=0,power=0;
        while(n>0) {
            num=num+(n%2)*(int)Math.pow(10,power++);
            n/=2;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Binary value :"+convertDTB(n));
    }
}
