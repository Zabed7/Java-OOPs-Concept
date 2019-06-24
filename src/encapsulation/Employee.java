package encapsulation;

public class Employee {
	
	//Variables
	private String eName;
	private int eSSN;
	private int eAge;
	
	//Methods
	public void eSkill(String s) {
		System.out.println(s);
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSSN() {
		return eSSN;
	}

	public void seteSSN(int eSSN) {
		this.eSSN = eSSN;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	
	

}
