import java.util.ArrayList;

public class GiftBoxWeightChecker {

	public static void main(String[] args) {
		
		ArrayList<GiftBox> boxes = new ArrayList<GiftBox>();
		double[] biscuitsWeights = {200.0, 100.0};
		double[] chocolateWeights = {200.0, 100.0};
		String[] chocolateFlavors = {"mint", "apple"};
		boxes.add(new GiftBox(biscuitsWeights, chocolateWeights, chocolateFlavors));
		
		biscuitsWeights = new double[]{300.0, 100.0, 100.0};
		chocolateWeights = new double[]{200.0, 100.0, 300.0};
		chocolateFlavors = new String[]{"milk", "vanilla", "coffee"};
		boxes.add(new GiftBox(biscuitsWeights, chocolateWeights, chocolateFlavors));
		
		for(GiftBox box: boxes) {
			if(box.getWeight() > 1000.0) {
				System.out.println("The box with " + box.getNumberOfBiscuits() + " biscuits and " + box.getNumberOfChocolate() + " chocolates is overweight");
				box.showBiscuitsWeights();
				box.showChocolateWeights();
				box.showChocolateFlavors();
				System.out.println();
			}
		}
		

		

	}

}
