
public class SoftwareEngineer extends TechnicalEmployee {
	
	private boolean codeAccess = false;
	private static int checkIns;
	
	public SoftwareEngineer(String name) {
		super(name);
	}
	
	public boolean getCodeAccess() {
		return codeAccess;
	}
	
	public void setCodeAccess(boolean access) {
		if (access == true) {
			codeAccess = true;
		} else codeAccess = false;
	}
		
	public int getSuccessfulCheckIns() {
		return checkIns;
	}
	
	public boolean checkInCode() {
		if (((TechnicalLead)this.manager).approveCheckIn(this)) {
			checkIns++;
			return true;
		} else {
			this.setCodeAccess(false);
			return false;
		}
	}
}
