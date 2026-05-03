import java.util.*;
public class Forloop {
    public int forLoop(int low,int high) {
        int sum=0;
        for(int i=low;i<=high;i++) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int low=in.nextInt();
        int high=in.nextInt();
        Forloop ob=new Forloop();
        System.out.println("Sum:"+ob.forLoop(low,high));
    }
}
