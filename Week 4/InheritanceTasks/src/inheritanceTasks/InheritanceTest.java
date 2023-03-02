package inheritanceTasks;

public class InheritanceTest {
	public static void main(String args[])
	{
		LoanAccount loan = new LoanAccount(1,"Abhinandan","Raipur",12,"July",5000);
		loan.topUpLoan(500);
		SavingsAccount sa = new SavingsAccount(1,"Abhinandan","Raipur",12,"July",4000);
		LoanAccount loan2 = new LoanAccount(1,"Abhinandan","Raipur",12,"July",400);
		System.out.println(loan.getBalance()+" "+sa.getBalance()+" "+loan2.getBalance());
	}
}
