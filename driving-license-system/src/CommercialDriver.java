
public class CommercialDriver extends GenericDriver {

	private String hazardousMaterialsType;
	private String carType;

	public CommercialDriver(String name, boolean isProvisional, String materialType, String car) {
		super(name, isProvisional);
		hazardousMaterialsType = materialType;
		carType = car;

	}

	public String getHazardousMaterialsType() {
		return hazardousMaterialsType;
	}

	// override GenericDriver's method
	public void setMedicalReport() {
		medicalReport = "Approved to drive " + carType;
	}

}
