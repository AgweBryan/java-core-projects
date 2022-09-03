
public class PaperBag extends Bag{

	@Override
	public double getPrice() {
		// length and width are private to Bag class
		// need getters to access them
		double area = getLength() * getWidth();
		price = area > 300.0 ? 0.2: 0.15;
		return price; 
	}

}
