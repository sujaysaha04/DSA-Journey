package Patterns;

public class P7 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--) {
            for(int j=2;j<=i;j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<=4;j++) {
                if(i%2==0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
