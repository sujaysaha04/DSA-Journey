package Loops;
import java.util.*;
public class L3 {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++) {
            factorial*=i;
        }
        System.out.println("Factorial:"+factorial);
    }
}
