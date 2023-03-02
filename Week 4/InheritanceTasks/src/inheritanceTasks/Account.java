package inheritanceTasks;
public class Account{
	int accountNo;
	String name, address;
	int phoneNo;
	String DOB;
	double balance;
	
	public Account(int accNo, String name, String address, int phNo, String dob, double balance)
	{
		this.accountNo=accNo;
		this.name=name;
		this.address=address;
		this.phoneNo=phNo;
		this.DOB=dob;
		this.balance=balance;
	}
	public void closeAccount()
	{
		System.out.println("Account closed");
	}
	public void setAccount(int acc)
	{
		this.accountNo=acc;
	}
	public int getAccountNo()
	{
		return this.accountNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setAddress(String add)
	{
		this.address=add;
	}	
	public String getAddress()
	{
		return this.address;
	}
	public void setPhoneNo(int ph)
	{
		this.phoneNo=ph;
	}
	public int getPhoneNo()
	{
		return this.phoneNo;
	}
	public void setDOB(String dob)
	{
		this.DOB=dob;
	}
	public String getDOB()
	{
		return this.DOB;
	}
	public void setBalance(double bal)
	{
		this.balance=bal;
	}
	public double getBalance()
	{
		return this.balance;
	}
}