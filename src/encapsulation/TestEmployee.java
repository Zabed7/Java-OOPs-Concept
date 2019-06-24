package encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.seteName("Ali");
		e.seteSSN(1234567);
		e.seteAge(27);
		
		System.out.println("My name is: " + e.geteName());
		System.out.println("SSN is: " + e.geteSSN());
		System.out.println("Age is: " + e.geteAge());
		e.eSkill("Job: " + "Software Programmer");
		
System.out.println(" "); //***************************************************************************************
		
		Employee e1 = new Employee();
		e1.seteName("Rahi");
		e1.seteSSN(7654321);
		e1.seteAge(18);
		
		System.out.println("My name is: " + e1.geteName());
		System.out.println("SSN is: " + e1.geteSSN());
		System.out.println("Age is: " + e1.geteAge());
		e.eSkill("Job: " + "House Wife");

	}
	
	

}
