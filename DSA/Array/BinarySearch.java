public class BinarySearch {
    public static int binarySearch(int arr[],int key) {
        int start=0,end=arr.length-1;

        while(start<=end) {
            int mid=(start+end)/2;
            if(key==arr[mid]) {
                return mid;
            } else if(key<arr[mid]) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
        int index=binarySearch(numbers, key);
        if(index!=0) {
            System.out.println("Found at index "+index);
        } else {
            System.out.println("Number not found ");
        }
    }
}
