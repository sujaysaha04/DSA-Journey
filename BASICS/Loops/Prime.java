package Loops;

import java.util.*;
class Prime {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<=1) {
            System.out.println("Not Prime");
        } else if(n==2) {
            System.out.println("Prime");
        } else {
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++) {
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}