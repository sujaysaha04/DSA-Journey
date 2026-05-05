public class A1 {
    public static boolean atleastTwice(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int num[]={1,2,3,1};
        // int num[]={1,2,3,4};
        int num[]={1,1,1,3,3,4,3,2,4,2};
        System.err.println(atleastTwice(num));
    }
}
