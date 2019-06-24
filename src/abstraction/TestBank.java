package abstraction;

public class TestBank extends MyBank{
	
	public static void main(String[] args) {
		
		MyBank b = new TestBank();
		b.savingAccount();
		b.checkingAccount();
		b.homeLoan();
		b.carLoan();
		b.studentLoan();
		System.out.println(bankName);
		System.out.println(b.accountFee);
	}

}
