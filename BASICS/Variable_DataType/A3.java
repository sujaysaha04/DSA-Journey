import java.util.*;
public class A3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a=in.nextFloat();
        float b=in.nextFloat();
        float c=in.nextFloat();
        float s=a+b+c;
        System.out.println("Total Cost including gst:"+(s*1.18));
    }
}
