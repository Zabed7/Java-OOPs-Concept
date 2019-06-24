package abstraction;

public abstract class USBank {
	
//Variables
	int accountFee = 100;
	
//Methods
	public void savingAccount() {
		System.out.println("This is saving account.");
	}
	
	public abstract void checkingAccount();

}
