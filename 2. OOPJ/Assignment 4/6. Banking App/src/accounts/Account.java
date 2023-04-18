package accounts;

public class Account {
	private String accNo;
	private double balance;

	
	
	public Account(String accNo, double balance) {
	
		this.accNo = accNo;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNString) {
		this.accNo = accNString;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean withdraw(double amount) {
		this.balance-=amount;
		return true;
		
		
	}
	public boolean deposit(double amount) {
		this.balance+=amount;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}

	
	
	

}
