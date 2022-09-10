import java.text.DecimalFormat;

public class TrainTicketMachine {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();

		double charge = TicketSystem.getCharge(Location.GLORIOUSLAKE, 
				false, 2);
		System.out.println("Charge: $" + df.format(charge));
		
		charge = TicketSystem.getCharge(Location.HAPPYTOWN, true, 3);
		System.out.println("Charge: $" + df.format(charge));
		
		charge = TicketSystem.getCharge(Location.SUNNCITY, true, 4);
		System.out.println("Charge: $" + df.format(charge));

	}

}
