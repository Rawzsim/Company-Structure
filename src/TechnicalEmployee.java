
public abstract class TechnicalEmployee extends Employee {
	
	private static double baseSalary = 75000;
	
	public TechnicalEmployee(String name) {
		super(name, baseSalary);
	}
	
	public String employeeStatus() {
		if (this instanceof SoftwareEngineer) {
			return super.employeeStatus() + " has " + ((SoftwareEngineer)this).getSuccessfulCheckIns() + " successful check ins";
		} else return super.employeeStatus();
	}
}
