package HW3;
/*	This class is a basic representation of an investment account. It is not an abstract class, 
	it can be instantiated, but it will be extended by other classes. The account must remember a 
	"rate" that will be used to accrue interest. It also charges a withdrawal fee for every
	withdrawal. */

public class InvestmentAccount extends Account {
	private double withdrawalFee;
	private double rate;

	/*
	 * Write a constructor that sets all values of the superclass, and also sets the
	 * fields for this class.
	 */
	public InvestmentAccount(double balance, String accountNumber, double withdrawalFee, double rate) {
		super(accountNumber, balance);
		this.withdrawalFee=withdrawalFee;
		this.rate=rate;
	}

	/*
	 * Write a "deposit" method that overrides the superclass' method. It should
	 * reject any negative value by returning 'false', accept any positive value by
	 * updating "balance" and returning 'true'.
	 */
	@Override
	public boolean deposit(double amt) {
		if(amt<0) {
			return false;
		}
		else {
			balance+=amt;
			return true;
		}
	}

	/*
	 * Write a "withdraw" method that overrides the superclass' method. It should
	 * deduct the amount and the withdrawalFee and then return 'true' unless this
	 * would result in a negative balance in which case it should just return
	 * 'false'.
	 */
	@Override 
	public boolean withdraw(double amt) {
		if((balance-amt)<0) {
			return false;
		}
		else {
			balance-=amt;
			return true;
		}
	}

	// The accrueInterest method is given to you:
	public double accrueInterest() {
		double interest = balance * rate;
		balance += interest;
		return interest;
	}
}
