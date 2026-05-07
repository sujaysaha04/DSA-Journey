// -----------AUXILARY ARRAY---------- T=O(N) ,S=O(N)

// public class TrappingRainwater {
//     public static int trappedWater(int arr[]) {
//         int len=arr.length;
//         int leftMax[]=new int[len];
//         leftMax[0]=arr[0];
//         //Calculate Left Max Boundary
//         for(int i=1;i<len;i++) {
//             leftMax[i]=Math.max(leftMax[i-1],arr[i]);
//         }
//         //Calculate Right Max Boundary
//         int rightMax[]=new int[len];
//         rightMax[len-1]=arr[len-1];
//         for(int i=len-2;i>=0;i--) {
//             rightMax[i]= Math.max(rightMax[i+1],arr[i]);
//         }
//         //Calculate Water Level and Trapped Water
//         int trappedWater=0;
//         for(int i=0;i<len;i++) {
//             int waterLevel=Math.min(leftMax[i],rightMax[i]);
//             trappedWater+=waterLevel-arr[i];
//         }
//         return trappedWater;
//     }
//     public static void main(String[] args) {
//         // int  height[]={4,2,0,6,3,2,5};
//         // int height[]={3,0,1,0,4,0,2};
//         int height[]={0,0,0,0};
//         System.out.println(trappedWater(height));
//     }
// }


// -------------TWO POINTER------------ T=O(N) ,S=O(1)
public class TrappingRainwater {
    public static int trappedWater(int arr[]) {
        int left=0,right=arr.length-1;
        int lMax=0,rMax=0;
        int trappedWater=0;
        while(left<right) {
            lMax=Math.max(lMax, arr[left]);
            rMax=Math.max(rMax,arr[right]);
            if(lMax<rMax) {
                trappedWater+=lMax-arr[left];
                left++;
            } else {
                trappedWater+=rMax-arr[right];
                right--;
            }
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int  height[]={4,2,0,6,3,2,5};
        // int height[]={3,0,1,0,4,0,2};
        // int height[]={0,0,0,0};
        System.out.println(trappedWater(height));
    }
}