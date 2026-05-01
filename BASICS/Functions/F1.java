package Functions;
import java.util.*;
public class F1 {
    public static double computeAverage(int a,int b,int c) {
        return (a+b+c)/3.0;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a =in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("Average:"+computeAverage(a,b,c));
    }
    
}
