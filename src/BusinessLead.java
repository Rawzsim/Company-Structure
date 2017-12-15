import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee {
	
	private static int headCount = 10;
	private ArrayList<Accountant> directReports = new ArrayList<Accountant>();
//	private double bonusBudget;
	
	public BusinessLead(String name) {
		super(name);
	}
	
	public boolean hasHeadCount() {
		if (directReports.size() < headCount) {
			return true;
		} else return false;
	}
		
	public boolean addReport(Accountant e, TechnicalLead supportTeam) {
		if (headCount > 0) {
			directReports.add(e);
			bonusBudget = bonusBudget + (e.getBaseSalary() * 1.1);
			e.supportTeam(supportTeam);
			((Employee)e).manager = this;
			return true;
		}
		return false;
	}
	
	public boolean requestBonus(Employee e, double bonus) {
//		Should check if the bonus amount requested would fit in current BusinessLead's budget. If it is, that employee should get that bonus, the BusinessLeader's budget should be deducted and true should be returned.
//		False should be returned otherwise
		if (bonusBudget >= bonus) {
			bonusBudget = bonusBudget - bonus;
			return true;
		}
		return false;
	}
	
	public boolean approveBonus(Employee e, double bonus) {
		for (Accountant acc : directReports) {
			if (acc.getTeamSupported().equals(e.getManager())) {
				if (acc.approveBonus(bonus)) {
					return true;
				}
			}
		}
//		This function should look through the Accountants the BusinessLead manages, and if any of them are supporting a the TechnicalLead that is the manager of the Employee 
//		passed in then the Accountant's budget should be consulted to see if the bonus could be afforded.
//		If the team can afford the bonus it should be rewarded and true returned, false otherwise
		return false;
	}
	
	
}
