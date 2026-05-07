// -----------T=O(N2)---------

public class SelectionSortAsc {
    public static void selectionSort(int arr[]) {
        int len=arr.length;
        for(int i=0;i<len-1;i++) {
            int minPos=i;
            for(int j=i+1;j<len;j++) {
                if(arr[minPos]>arr[j]) {
                    minPos=j;
                }
            }
            int temp=arr[i]; 
            arr[i]=arr[minPos];
            arr[minPos]=temp;
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
        selectionSort(arr);
        printArr(arr);
    }
}
