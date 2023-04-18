package accounts;

public class CheckingAccount extends Account{
	private final double OVERDRAFT_LIMIT= -400;
    private final double PENALTY=20;
	
    public CheckingAccount(String accNo, double balance) {
		super(accNo, balance);
	}
    
    
	public boolean withdraw(double amount) {
		if((super.getBalance()-amount)<this.OVERDRAFT_LIMIT) {
			return false;
		}
		super.withdraw(amount);
		if(super.getBalance()<0) super.withdraw(this.PENALTY);
		return true;
		
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
}
