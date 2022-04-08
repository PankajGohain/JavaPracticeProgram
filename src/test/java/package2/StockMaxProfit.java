package package2;

public class StockMaxProfit {

	public static void main(String[] args) {

		int price[] = {7, 1, 5, 3, 6, 4};
		
		if(price.length<2) {
			System.out.println("Profit is 0");
		}
		
		int min = price[0];
		int profit = 0;
		for (int i = 1; i < price.length; i++) {
			profit = Math.max(profit, price[i] - min);
			min = Math.min(min, price[i]);
		}

		System.out.println("Min buy:" + min);
		System.out.println("Max profit:" + profit);
	}

}


//4,2,1

//7, 1, 5, 3, 6, 4