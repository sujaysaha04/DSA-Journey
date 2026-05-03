public class Pairs {
    public static void printPairs(int arr[]) {
        int len=arr.length;
        for(int i=0;i<len-1;i++) {
            for(int j=i+1;j<len;j++) {
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printPairs(number);
    }
}
