
public abstract class BusinessEmployee extends Employee {
	
	private static double baseSalary = 50000;
	public double bonusBudget;

	public BusinessEmployee(String name) {
		super(name, baseSalary);
	}
	
	public double getBonusBudget() {
		// Should establish a running tally of the remaining bonusBudget for the team this employee supports.
		// How that budget is determined will depend on which type of Business Employee it is
		return bonusBudget;
	}
	
	public String employeeStatus() {
		return super.employeeStatus() + " with a budget of " + this.getBonusBudget();
	}
}
