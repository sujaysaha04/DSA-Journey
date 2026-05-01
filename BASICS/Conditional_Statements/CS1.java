import java.util.*;
public class CS1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        if(number>0) {
            System.out.println("Positive");
        }
        else {
            System.err.println("Negative");
        }
    }
}
