
public class Accountant extends BusinessEmployee {
	
//	private double bonusBudget;
	private TechnicalLead supportTeam;
	
	public Accountant(String name) {
		super(name);
	}
	
	public TechnicalLead getTeamSupported() {
		if (supportTeam.getName() != null) {
			return supportTeam;
		}
		else return null;
	}
	
	public void supportTeam(TechnicalLead lead) {
		supportTeam = lead;
		for (SoftwareEngineer eng : lead.directReports) {
			this.bonusBudget = this.bonusBudget + (eng.getBaseSalary() * 1.1);
		}
	}
	
	public boolean approveBonus(double bonus) {
		if (bonusBudget < bonus && this.getTeamSupported() != null) {
			bonusBudget = bonusBudget - bonus;
			return true;
		} else return false;
/*		Should take in a suggested bonus amount and check if there is still enough room in the budget.
		If the bonus is greater than the remaining budget, false should be returned, otherwise true.
		If the accountant is not supporting any team false should be returned.*/
	}
	
	public String employeeStatus() {
		if (this.getTeamSupported() != null) {
			return this.getEmployeeID() + " " + this.getName() + " with a budget of " + bonusBudget + " is supporting " + this.getTeamSupported();
		} else {
			return this.getEmployeeID() + " " + this.getName() + " with a budget of " + bonusBudget + " is not currently supporting a Technical Lead";
		}
	}

}
