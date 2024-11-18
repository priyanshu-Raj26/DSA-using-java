public class Buy_and_Sell_Stock {

    public static void Stocks(int array[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit  = 0;

        for (int i = 0; i < array.length; i++) {
            if (buyprice < array[i]) {
                maxprofit = Math.max(maxprofit, array[i] - buyprice);
            }
            else {
                buyprice = array[i];
            }
        }
        System.out.println("Max profit is: "+ maxprofit);
    }

    public static void main(String[] args) {
        int array[] = {7, 1, 5, 3, 6, 4};
        Stocks(array);
    }
}
