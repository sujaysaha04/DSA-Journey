public class BuySellStock {
    public static int profit(int arr[]) {
        int buyPrice=arr[0];
        int maxProfit=0;
        for(int i=1;i<arr.length;i++) {
            int currProfit=arr[i]-buyPrice;
            if(currProfit>0) { 
                maxProfit=Math.max(maxProfit,currProfit);
            }
            else {
                buyPrice=arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,0,4,8};
        // int price[]={5,4,3,2,1};
        // int price[]={7,1,5,3,6,4};   //O(N)
        System.out.println(profit(price));
    }
}
