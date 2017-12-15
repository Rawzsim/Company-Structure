
public abstract class Employee {
	
	private static int baseId;
	private int currentId;
	private String employeeName;
	private double baseSalary;
	public Employee manager;

	public Employee(String name, double baseSalary) {
		baseId++;
		currentId = baseId;
		if (this instanceof TechnicalLead) {
			baseSalary = baseSalary * 1.3;
		} else if (this instanceof BusinessLead) {
			baseSalary = baseSalary * 2.0;
		}
		this.baseSalary = baseSalary;
		this.employeeName = name;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public String getName() {
		return employeeName;
	}
	
	public int getEmployeeID() {
		return currentId;
	}
	
	public Employee getManager() {
		return manager;
	}
		
	
	public boolean equals(Employee other) {
		if (this.getEmployeeID() == other.getEmployeeID()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return currentId + " " + employeeName;
	}
	
	public String employeeStatus() {
		return this.getEmployeeID() + " " + this.getName();
	}
}
