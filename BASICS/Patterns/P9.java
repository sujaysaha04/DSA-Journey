package Patterns;

public class P9 {
    void printStar(int i) {
        for(int j=4;j>=i;j--) {
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        P9 ob=new P9(); 
        for(int i=1;i<=5;i++) {
            ob.printStar(i);
            System.out.println();
        }
        for(int i=4;i>=1;i--) {
            ob.printStar(i);
            System.out.println();
        }
    }
}
