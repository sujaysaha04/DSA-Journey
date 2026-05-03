public class Reverse {
    public static void reverse(int arr[]) {
        int len=arr.length;
        for(int i=0;i<len/2;i++) {
            int temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        reverse(number); 
        for(int i=0;i<number.length ;i++) {
            System.out.print(number[i]+" ");
        }
    }
}
