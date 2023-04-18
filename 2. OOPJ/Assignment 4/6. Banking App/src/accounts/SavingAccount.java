package accounts;

public class SavingAccount extends Account {
	private final double INT_RATE = 0.2;
	private double intAmount;

	public SavingAccount(String accNo, double balance) {
		super(accNo, balance);
	}
	
	public double getIntAmount() {
		return intAmount;
	}

	public void setIntAmount(double intAmount) {
		this.intAmount = intAmount;
	}

	public void calIntRate() {
		this.intAmount = super.getBalance() * INT_RATE;
	}

	public void setBalance() {

		super.setBalance(this.intAmount + super.getBalance());
	}

	public double getBalance() {

		return super.getBalance();
	}

	public boolean withdraw(double amount) {
		if(amount>super.getBalance()) {
			return false;
		}
		super.withdraw(amount);
		return true;
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}

}
