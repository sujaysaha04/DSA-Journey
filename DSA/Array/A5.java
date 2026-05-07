public class A5 {
    public static void triplets(int arr[]) {
        int len=arr.length;
        for(int i=0;i<len;i++) {
            for(int j=i+1;j<len;j++) {
                for(int k=j+1;k<len;k++) {
                    if((arr[i]+arr[j]+arr[k])==0) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        triplets(arr);
    }
}
