//  ---------MINIMUM SUM SUBARRAY(KADANE ALGO)----------

public class MinSumSubarray {
    public static void kadaneAlgo(int arr[]) {
        int sum=0,start=0,end=0,tempStart=0;
        int minSum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            if(minSum>sum) {
                minSum=sum;
                start=tempStart;
                end=i;
            }
            if(sum>=0) {
                sum=0;
                tempStart=i+1;
            }
        }
        System.out.println(minSum);
        for(int i=start;i<=end;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    } 
    public static void main(String[] args) {
        int arr[]={3,-4,2,-3,-1,7,-5};
        kadaneAlgo(arr);
        int number[]={-2,-3,4,-1,-2,1,5,-3};
        kadaneAlgo(number);
    }
}

/* ---------TRAPPING WATER----------

public class MinSumSubarray {
    public static int  trappingWater(int arr[]) {
        int len=arr.length;
        int leftMax[]=new int[len];
        leftMax[0]=arr[0];
        for(int i=1;i<len;i++) {
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
        int rightMax[]=new int[len];
        rightMax[len-1]=arr[len-1];
        for(int i=len-2;i>=0;i--) {
            rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        }
        int trappedWater=0;
        for(int i=0;i<len;i++) {
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-arr[i];
            System.out.println(arr[i]+"="+(waterLevel-arr[i]));
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[]={3,0,1,0,4,0,2};
        System.out.println(trappingWater(height));
    }
}
    */
