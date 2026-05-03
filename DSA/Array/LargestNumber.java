public class LargestNumber {
     public static int largestNumber(int arr[]) {
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(largest<arr[i]) {
                largest=arr[i];
            }
        }

        return largest;
     }
     public static void main(String[] args) {
         int number[]={1,2,6,3,5};
         System.out.println("Largest:"+largestNumber(number));
     } 
}
