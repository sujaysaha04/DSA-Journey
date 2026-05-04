public class KadaneAlgo {
    public static void maxSubarray(int arr[]) {
        int len=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int maxStart=0,maxEnd=0,tempStart=0;    //Ony for printing the subarray
        for(int i=0;i<len;i++) {
            sum+=arr[i];
            if(maxSum<sum) {    //maxSum=(int)Math.max(sum,maxSum);
                maxSum=sum;
                maxStart=tempStart;
                maxEnd=i;
            }
            if(sum<=0) {     //sum=sum<0?0:sum;
                sum=0;
                tempStart=i+1;
            }
        }
        System.out.println("Maximum Sum:"+maxSum);
        for(int i=maxStart;i<=maxEnd;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int number[]={-2,-3,4,-1,-2,-1,5,-3,8};
        //int number[]={-4,-3,-2,-1};
        maxSubarray(number);
    }
}
