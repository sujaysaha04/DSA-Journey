public class SubArrays {
    public static void subArray(int arr[]) {
        int len=arr.length;
        for(int i=0;i<len;i++) {
            for(int j=i;j<len;j++) {
                System.out.print("("+arr[i]);
                for(int k=i+1;k<=j;k++) {
                    System.out.print(","+arr[k]);
                }
                System.out.print(") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        subArray(number);
    }
}
