
public class PlasticBag extends Bag {
	
	private double tax;

	@Override
	public double getPrice() {
		// length and width are private to Bag class
		// need getters to access them
		double area = getLength() * getWidth();
		price = area > 250 ? 0.3 : 0.2;
		return price + tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	

}
