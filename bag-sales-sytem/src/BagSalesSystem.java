import java.util.Scanner;

public class BagSalesSystem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter length of paper bag: ");
		double paperBagLength = scanner.nextDouble();
		
		System.out.println("Enter the width of the paper bag: ");
		double paperBagWidth = scanner.nextDouble();
		
		PaperBag paperBag = new PaperBag();
		paperBag.setLength(paperBagLength);
		paperBag.setWidth(paperBagWidth);
		
		System.out.println("Paper bag price: $" + paperBag.getPrice());
		
		System.out.println("Enter length of plastic bag: ");
		double plasticBagLength = scanner.nextDouble();
		
		System.out.println("Enter the width of the plastic bag: ");
		double plasticBagWidth = scanner.nextDouble();
		
		System.out.println("Enter the tax for the plastic bag: ");
		double tax = scanner.nextDouble();
		
		PlasticBag plasticBag = new PlasticBag();
		plasticBag.setLength(plasticBagLength);
		plasticBag.setWidth(plasticBagWidth);
		plasticBag.setTax(tax);
		
		System.out.println("Plastic bag price: $" + plasticBag.getPrice());
		
		scanner.close();
	}

}
