import java.util.*;
public class Whileloop {
    public int whileLoop(int d) {
        int sum=0;
        int count=1;
        while(count<=50) {
            sum+=d;
            d+=10;
            count++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int d=in.nextInt();
        Whileloop ob=new Whileloop();
        System.out.println("Sum:"+ob.whileLoop(d));
    }
}
