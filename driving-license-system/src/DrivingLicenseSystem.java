
public class DrivingLicenseSystem {

	public static void main(String[] args) {

		GenericDriver tom = new GenericDriver("Tom", true);
		tom.deduct(3);
		tom.setMedicalReport();

		CommercialDriver lily = new CommercialDriver("Lily", false, "Inflammable", "Truck");
		lily.deduct(5);
		lily.setMedicalReport();

		GenericDriver[] driverArray = new GenericDriver[2];
		driverArray[0] = tom;
		driverArray[1] = lily; 

		for (int i = 0; i < driverArray.length; i++) {
			GenericDriver genericDriver = driverArray[i];
			System.out.println(
					genericDriver.getName() + "'s license is provisional: " + genericDriver.getIsProvisional());

			System.out.println(genericDriver.getName() + " has " + genericDriver.getPoints() + " points");

			System.out.println(genericDriver.getMedicalReport());
			System.out.println();
		}
		
		System.out.println(lily.getHazardousMaterialsType());

	}

}
