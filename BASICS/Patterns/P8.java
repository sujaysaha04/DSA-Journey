package Patterns;

public class P8 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--) {
            for(int j=2;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++) {
                if(i==1||j==1||i==5||j==5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
