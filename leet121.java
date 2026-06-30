public class leet121{
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int maxpro = 0;

        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {

                int profit = prices[j] - prices[i];

                if(profit > maxpro) {
                    maxpro = profit;
                }
            }
        }

        System.out.println("Max Profit: " + maxpro);
    }
}
