public class InsertionSortAsc {
    public static void insertionSort(int arr[]) {
        int len=arr.length;
        for(int i=1;i<len;i++) {
            int pos=i,num=arr[i];
            for(int j=0;j<i;j++) {
                if(arr[i]<arr[j]) {
                    pos=j;
                    break;
                }
            }
            for(int j=i;j>pos;j--) {
                arr[j]=arr[j-1];
            }
            arr[pos]=num;
            printArr(arr);
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
}
