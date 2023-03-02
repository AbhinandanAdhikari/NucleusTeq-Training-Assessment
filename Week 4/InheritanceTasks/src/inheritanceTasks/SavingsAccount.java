package inheritanceTasks;
public class SavingsAccount extends Account {
	public SavingsAccount(int accNo, String name, String address, int phNo, String dob, double balance) {
		super(accNo, name, address, phNo, dob, balance);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(int amt)
	{
		if(amt > super.getBalance())
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			super.balance = super.balance - amt;
		}
	}
	public void deposit(int amt)
	{
		super.balance=super.balance+amt;
	}
	public void fixedDeposit(int amt)
	{
		super.balance = super.balance+amt;
	}
}
