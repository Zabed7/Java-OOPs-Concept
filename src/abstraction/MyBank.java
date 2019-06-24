package abstraction;

public class MyBank extends USBank implements ChaseBank{

	@Override
	public void homeLoan() {
		System.out.println("This is home loan.");
		
	}

	@Override
	public void carLoan() {
		System.out.println("This is car loan.");
		
	}

	@Override
	public void studentLoan() {
		System.out.println("This is student loan.");
		
	}

	@Override
	public void checkingAccount() {
		System.out.println("This is checking account.");
		
	}

}
