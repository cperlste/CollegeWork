package HW3;
/*	This class represents a savings account that is a subclass of InvestmentAccount.
	The only additional functionality in this class is that any deposit over 500
	adda a bonus .05 to "balance". */

public class SavingsAccount extends InvestmentAccount {
	/*
	 * Add a constructor that calls the superclass' constructor with all relevant
	 * values. The "rate" for the superclass should be hardcoded in as 0.02.
	 */
	public SavingsAccount(double balance, String accountNumber, double withdrawalFee) {
		super(balance, accountNumber, withdrawalFee, .02);
	}

	/*
	 * Add a "deposit" method that overrides the superclass' deposit method. It
	 * should add .05 to "balance" if the requested deposit amount is over 500. Then
	 * use the superclass' method to complete the deposit and return the result to
	 * the caller.
	 */
	@Override
	public boolean deposit(double amt) {
		if(amt>500) {
			balance+=.05;
		}
		return super.deposit(amt);
	}

}
