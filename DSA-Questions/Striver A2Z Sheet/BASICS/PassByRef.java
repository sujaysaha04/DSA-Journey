import java.util.*;
public class PassByRef {
    public void reverse(int []arr) {
        int len=arr.length;
        for(int i=0;i<len/2;i++) {
            int temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
        for(int i=0;i<len;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
        PassByRef ob=new PassByRef();
        ob.reverse(arr);
    }
}
