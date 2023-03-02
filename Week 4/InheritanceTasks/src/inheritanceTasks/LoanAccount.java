package inheritanceTasks;

public class LoanAccount extends Account{

	public LoanAccount(int accNo, String name, String address, int phNo, String dob, double balance) {
		super(accNo, name, address, phNo, dob, balance);
		// TODO Auto-generated constructor stub
	}
	public void payEMI(int amt)
	{
		if(amt > super.getBalance())
		{
			System.out.println("Insufficient balance");
		}
		else {
		super.balance = super.balance-amt;
		}
	}
	public void topUpLoan(double amt)
	{
		super.balance = super.balance + amt;
	}
	public void repayment(double amt)
	{
		if(super.getBalance()<amt)
		{
			System.out.println("insufficient balance");
		}
		else
		{
			super.balance = super.balance-amt;
		}
	}
}
