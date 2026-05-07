public class A4 {
    public static int trapWater(int elevation[]) {
        int len=elevation.length;
        int leftMax[]=new int[len];
        leftMax[0]=elevation[0];
        for(int i=1;i<len;i++) {
            leftMax[i]=Math.max(leftMax[i-1],elevation[i]);
        }
        int rightMax[]=new int[len];
        rightMax[len-1]=elevation[len-1];
        for(int i=len-2;i>=0;i--) {
            rightMax[i]=Math.max(rightMax[i+1],elevation[i]);
        }
        int trapWater=0;
        for(int i=0;i<len;i++) {
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trapWater+=waterLevel-elevation[i];
        }
        return trapWater;
    }
    public static void main(String[] args) {
        // int elevation[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int elevation[]={4,2,0,3,2,5};
        System.out.println(trapWater(elevation));
    }
}
