 /*       ---------BRUTE FORCE---------   T=O(n3), S=O(1)

 public class MaxMinSubarray {
    public static void maxMinSubarray(int arr[]) {
        int len=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        for(int i=0;i<len;i++) {
            for(int j=i;j<len;j++) {
                int sum=0;
                for(int k=i;k<=j;k++) {
                    sum+=arr[k];
                }
                if(maxSum<sum) {
                    maxSum=sum;
                }
                if(minSum>sum) {
                    minSum=sum;
                }
            }
        }
        System.out.println("Minimum Sum:"+minSum);
        System.out.println("Maximum Sum:"+maxSum);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3 };
        maxMinSubarray(number);
    }
}

*/ 

/*   -----------PREFIX SUM------------- T=O(n2), S=O(n)

public class MaxMinSubarray {
    public static void maxMinSubarray(int arr[]) {
        int len=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int prefix[]=new int[len];
        prefix[0]=arr[0];
        for(int i=1;i<len;i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<len;i++) {
            int sum=0;
            for(int j=i;j<len;j++) {
                sum=(i==0)? prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<sum) {
                    maxSum=sum;
                }
                if(minSum>sum) {
                    minSum=sum;
                }
            }
        }
        System.out.println("Minimum Sum:"+minSum);
        System.out.println("Maximum Sum:"+maxSum);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3 };
        maxMinSubarray(number);
    }
}

*/

/*   ---------MORE OPTIMIZED BY ME----------  T=O(n2), S=O(1)

 public class MaxMinSubarray {
    public static void maxMinSubarray(int arr[]) {
        int len=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        for(int i=0;i<len;i++) {
            int sum=0;
            for(int j=i;j<len;j++) {
                sum+=arr[j];
                if(maxSum<sum) {
                    maxSum=sum;
                }
                if(minSum>sum) {
                    minSum=sum;
                }
            }
        }
        System.out.println("Minimum Sum:"+minSum);
        System.out.println("Maximum Sum:"+maxSum);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3 };
        maxMinSubarray(number);
    }
}

*/


//   ----------KADANE'S ALGORITHM------------

public class MaxMinSubarray {
    public static void maxSubarray(int arr[]) {
        int len=arr.length;
        int maxSum=arr[0];
        int sum=0;
        for(int i=0;i<len;i++) {
            sum+=arr[i];
            maxSum=(int)Math.max(sum,maxSum);
            sum=sum<0?0:sum;
        }
        System.out.println("Maximum Sum:"+maxSum);
    }
    public static void main(String[] args) {
        int number[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubarray(number);
    }
}

 