
public class AverageStockPrice {

	public static void main(String[] args) {

		Stock companyX = new Stock();
		
		companyX.buy(33.2, 2000);
		companyX.buy(38.5, 3000);
		companyX.sell(42.2, 1000);
		
		System.out.println(companyX.getShares());
		System.out.println(companyX.getPrice());
		System.out.println(companyX.getAveragePrice());

	}

}
