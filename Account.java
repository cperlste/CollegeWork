package HW3;
/*
	This is the "abstract" class, Account. It is a blueprint for all other classes that
	will extend it. It will have some abstract methods, just to ensure that other Account
	classes have those methods, and some concrete methods that all subclasses can use.
*/
public abstract class Account {
	/*
	 * Add a double "balance". This field should be visible to all inheriting
	 * classes, but hidden from any outside classes.
	 */
	protected double balance;

	/*
	 * Add a String "acctNumber". This field should be hidden from ALL classes,
	 * including subclasses.
	 */
	private String acctNumber;

	/* Add a public getter to get the "balance" property. */
	public double getBalance() {
		return balance;
	};
	//I am adding a public getter to get the acctNumber (for my print statement)
	public String getAcctNumber() {
		return acctNumber;
	}

	/*
	 * Add two abstract methods that ensure that all subclasses can "deposit", and
	 * "withdraw". Both methods take a double and return a boolean to indicate
	 * whether or not the transaction succeeded.
	 */
	public abstract boolean deposit(double amt);
	public abstract boolean withdraw(double amt);

	// This concrete constructor is given to you:
	public Account(String acctNumber, double initialBalance) {
		if (initialBalance < 0) {
			initialBalance = 0;
		}
		balance = initialBalance;
		this.acctNumber = acctNumber;
	}

	/*
	 * Add a concrete method, transferOut, that will be inherited by all subclasses.
	 * It should take a double that is the amount of the transfer, and a reference
	 * to another instance of Account. If there is enough money in "this" account to
	 * complete the transfer, complete it and return 'true', otherwise return
	 * 'false'.
	 */
	public boolean transferOut(double amt, Account account) {
		if(amt<=this.balance) {
			this.withdraw(amt);
			account.deposit(amt);
			return true;
		}
		else {
			return false;
		}
	}

	/*
	 * Add a concrete toString() method that returns a String representation of the
	 * Account, including the account number and the balance. Remember this method
	 * is overriding the toString method in Object, so you should use the correct
	 * annotation.
	 */
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Account Number: "+acctNumber+"\n"+"Balance: "+balance);
		return sb.toString();
	}

}
