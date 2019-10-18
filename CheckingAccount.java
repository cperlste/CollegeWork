package HW3;
/*	This is a class to represent a checking account. It should be a subclass of "Account".
	The checking account will complete a deposit if the amount is positive, and less than
	10000 (it will reject *high* deposits greater than this amount). Withdrawals are assumed
	to be checks. A withdrawal/check is rejected if the amount is negative. In addition, 
	a certain number of checks are free, and after that amount there is a charge for each check.
	*/
	
public class CheckingAccount extends Account {
	private int totalChecks = 0;
	private int freeChecks;
	private double checkFee;
	
	/*	Write a constructor that provides the necessary information to the superclass' constructor
		and also sets the correct values for 'freeChecks' and 'checkFee'.*/
	public CheckingAccount(String acctNum, double initialBalance, int freeChecks, double checkFee) {
		super(acctNum, initialBalance);
		this.freeChecks=freeChecks;
		this.checkFee=checkFee;
	}
		

	/* 	Write a "deposit" method that overrides the abstract method in the superclass. As noted
		above, it should return false if the amount is 0 or negative, or if it is above 10000.
		Otherwise it should adjust "balance" and return 'true'. */
	@Override
	public boolean deposit(double amt) {
		if(amt<=0 || amt>10000) {
			return false;
		}
		balance+=amt;
		return true;
	}

	/*	Write a "withdraw" method that overrides the abstract method in the superclass. As noted
		above, it should reject 0 or negative amounts. For a positive amount, it should check
		if "totalChecks" is greater than "freeChecks" and if it is reduce "balance" by 
		"checkFee", in addition to the amount of the withdrawal/check. It is okay to 
		allow negative balances. */
	@Override
	public boolean withdraw(double amt) {
		if(amt<=0) {
			return false;
		}
		if(totalChecks>freeChecks) {
			balance-=checkFee;
			balance-=amt;
		}
		return true;
	}


}
