package HW3;
/*	This class represents a money market account. It extends InvestmentAccount. Its deposits
	will work exactly the same way they do in an InvestmentAccount, but withdrawals have an
	extra rule. There is a minimum balance that must be maintained (passed in to the constructor)
	and any withdrawal that either causes the balance to go below the minimum, or is made after
	the balance is already below the minimum, incurs a penalty of 50. 
	
	This account also has a special feature, any friend that is referred is awarded with a bonus
	increase of 5. A valid email address must be submitted, and it cannot be a duplicate of 
	an email address that was already submitted. For our purposes, a valid email address has
	an @ character in it, and has a . as the fourth to last character. */

public class MoneyMarketAccount extends InvestmentAccount {

	private double minBalance;

	/*
	 * Write a constructor that sets all values of the superclass, and also sets the
	 * fields for this class.
	 */
	public MoneyMarketAccount(double balance, String accountNumber, double withdrawalFee, double rate, double minBalance) {
		super(balance, accountNumber, withdrawalFee, rate);
		this.minBalance=minBalance;		
	}

	/*
	 * Write a "withdraw" method that overrides the method in the superclass. It
	 * should deduct 50 from "balance" if the amount after the withdrawal will be
	 * below "minBalance". After that, it should rely on the logic of the superclass
	 * to perform the withdrawal and return the result. 50 should be deducted even
	 * if the superclass' "withdraw" method returns 'false'.
	 */
	@Override
	public boolean withdraw(double amt) {
		if((balance-amt)<minBalance) {
			balance-=50;
		}
		return super.withdraw(amt);
	}

	/*
	 * Write a "referFriend" method that takes a String as a parameter. If the
	 * String has not been entered before (hint: ArrayList has a method "contains"),
	 * and the email address contains the '@' character anywhere and the '.'
	 * character as its fourth to last character, add 5 to "balance" and return
	 * 'true'. Otherwise return 'false'.
	 */
	public boolean referFriend(String email) {
		if(email.contains("@")&& email.charAt(email.length()-4)=='.') {
			balance+=5;
			return true;
		}
		return false;
	}

}
