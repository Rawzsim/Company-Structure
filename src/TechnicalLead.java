import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
	
	private static int headCount = 4;
	public ArrayList<SoftwareEngineer> directReports = new ArrayList<SoftwareEngineer>();

	public TechnicalLead(String name) {
		super(name);
	}
	
	public boolean hasHeadCount() {
		if (headCount - directReports.size() > 0) {
			return true;
		} else return false;
	}
	
	public boolean addReport(SoftwareEngineer e) {
		if (hasHeadCount()) {
			directReports.add(e);
			((Employee)e).manager = this;
			return true;
		} else return false;
	}
	
	public boolean approveCheckIn(SoftwareEngineer e) {
		if (directReports.contains(e) && e.getCodeAccess()) {
			return true;
		} else return false;
	}
	
	public boolean requestBonus(Employee e, double bonus) {
//		Should check if the bonus amount requested would be approved by the BusinessLead supporting this TechnicalLead.
//		If it is, that employee should get that bonus and true should be returned. False should be returned otherwise
		return false;
	}
	
	public String getTeamStatus() {
		String text = "";
		if(directReports.size() < 1) {
			return this.employeeStatus() + " and no direct reports yet";
		}else{
			for(SoftwareEngineer a : directReports) {
				text += "\n" + a.employeeStatus();
			}
			return this.employeeStatus() + " and is managing:" + text;
		}
	}
}
