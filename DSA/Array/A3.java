public class A3 {
    public static int profit(int price[]) {
        int buyPrice=price[0];
        int maxProfit=0;
        for(int i=1;i<price.length;i++) {
            int currProfit=price[i]-buyPrice;
            if(currProfit>0) {
                maxProfit=Math.max(maxProfit, currProfit);
            } else {
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        // int price[]={7,1,5,3,6,4};
        int price[]={7,6,4,3,1};
        System.out.println(profit(price));
    }
}
