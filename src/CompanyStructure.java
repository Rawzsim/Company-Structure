
public class CompanyStructure {

	public static void main(String[] args) {
/*		TechnicalLead bob = new TechnicalLead("Bob");
		SoftwareEngineer rob = new SoftwareEngineer("Rob");
		bob.addReport(rob);
		System.out.println("Robs manager is " + rob.getManager());
		TechnicalLead nob = new TechnicalLead("Nob");
		SoftwareEngineer fob = new SoftwareEngineer("Fob");
		nob.addReport(fob);
		System.out.println("Fobs manager is " + fob.getManager());
		System.out.println("Robs manager is " + rob.getManager());
//		BusinessLead gob = new BusinessLead("Gob");
//		Employee nob = new Employee("Nob", 20.50);
//		Employee rob = new Employee("Rob", 9.99);
//		System.out.println(rob + " " + rob.getBaseSalary());
//		System.out.println(bob + " " + bob.getBaseSalary());
		System.out.println(bob + " " + bob.getBaseSalary());
		System.out.println(rob + " " + rob.getBaseSalary());*/
		
        TechnicalLead CTO = new TechnicalLead("Satya Nadella");
        SoftwareEngineer seA = new SoftwareEngineer("Kasey");
        SoftwareEngineer seB = new SoftwareEngineer("Breana");
        SoftwareEngineer seC = new SoftwareEngineer("Eric");
        CTO.addReport(seA);
        CTO.addReport(seB);
        CTO.addReport(seC);
        System.out.println(CTO.getTeamStatus());

        TechnicalLead VPofENG = new TechnicalLead("Bill Gates");
        SoftwareEngineer seD = new SoftwareEngineer("Winter");
        SoftwareEngineer seE = new SoftwareEngineer("Libby");
        SoftwareEngineer seF = new SoftwareEngineer("Gizan");
        SoftwareEngineer seG = new SoftwareEngineer("Zaynah");
        VPofENG.addReport(seD);
        VPofENG.addReport(seE);
        VPofENG.addReport(seF);
        VPofENG.addReport(seG);
        System.out.println(VPofENG.getTeamStatus());

        BusinessLead CFO = new BusinessLead("Amy Hood");
        Accountant actA = new Accountant("Niky");
        Accountant actB = new Accountant("Andrew");
        CFO.addReport(actA, CTO);
        CFO.addReport(actB, VPofENG);
        System.out.println(CFO.employeeStatus());

	}

}
