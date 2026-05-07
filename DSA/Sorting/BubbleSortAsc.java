// -------------T=O(N2)-------------

// public class BubbleSortAsc {
//     public static void bubbleSort(int arr[]) {
//         int len=arr.length;
//         for(int i=0;i<len-1;i++) {
//             for(int j=0;j<len-1-i;j++) {
//                 if(arr[j]>arr[j+1]) {
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }
//     public static void printArr(int arr[]) {
//         for(int i=0;i<arr.length;i++) {
//             System.out.print(arr[i]+" ");
//         } 
//     }
//     public static void main(String[] args) {
//         int arr[]={5,4,1,3,2};
//         bubbleSort(arr);
//         printArr(arr);
//     }
// }

// ---------OPTIMIZED BUBBLESORT(FOR ALREADY SORTED ARRAY) T=O(N)  -----------

public class BubbleSortAsc {
    public static void bubbleSort(int arr[]) {
        int len=arr.length;
        for(int i=0;i<len-1;i++) {
            int swap=0;
            for(int j=0;j<len-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) {
                break;
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        } 
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        bubbleSort(arr);
        printArr(arr);
    }
}