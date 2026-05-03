import java.util.*;
public class LinearSearch {
    public int linearSearch(int arr[],int key) {
        for(int i=0;i<arr.length;i++) {
            if(key==arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
        int key=in.nextInt();
        LinearSearch ob=new LinearSearch();
        int index=ob.linearSearch(arr,key);
        if(index!=-1) {
            System.out.println("Found at index "+index);
        } else {
            System.out.println("Number not found");
        }
    }
}