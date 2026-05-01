package Patterns;

public class P6 {
    void printStar(int i) {
        for(int j=2;j<=i;j++) {
            if(i%2==0) {
                System.out.print("  ");
            } else {
                    System.out.print("* ");
            }
        }
    }
    public static void main(String[] args) {
        P6 ob=new P6();
        int space=6;
        for(int i=1;i<=4;i++) {
            ob.printStar(i);
            System.out.print("* ");
            for(int j=space;j>=1;j--) {
                System.out.print("  ");
            }
            space-=2;
            System.out.print("* ");
            ob.printStar(i);
            System.out.println();
        }
        for(int j=1;j<=8;j++) {
            System.out.print("* ");
        }
        System.out.println();
        space=0;
        for(int i=4;i>=1;i--) {
            ob.printStar(i);
            System.out.print("* ");
            for(int j=space;j>=1;j--) {
                System.out.print("  ");
            }
            space+=2;
            System.out.print("* ");
            ob.printStar(i);
            System.out.println();
        }
        System.out.println();
    }
}
