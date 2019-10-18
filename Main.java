package HW3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner kb = new Scanner(System.in);
	public static ArrayList<Account>accounts= new ArrayList<Account>();
	public static void main(String[] args) {
		
		char choice;

		do {
			System.out.println("'A'dd account, 'D'eposit, 'W'ithdraw, Accrue 'I'nterest, "
					+ "Total 'B'alance, 'T'ransfer, 'S'ummary, 'R'efer friend, 'Q'uit");
			choice = kb.nextLine().toUpperCase().charAt(0);
			switch (choice) {
			case 'A':
				addAccount();
				break;
			case 'D':
				deposit();
				break;
			case 'W':
				withdraw();
				break;
			case 'I':
				getInterest();		
				break;
			case 'B':
				displayBalance();
				break;
			case 'S':
				for(int x=0; x<accounts.size(); x++) {
					accounts.get(x).toString();
				}
				break;
			case 'T':
				transfer();
				break;
			case 'R':
				System.out.println("Enter an email address");
				String email=kb.nextLine();
				for(int x=0; x<accounts.size();x++) {
					if(accounts.get(x)instanceof MoneyMarketAccount) {
						boolean result=((MoneyMarketAccount)accounts.get(x)).referFriend(email);
						if(result==true) {
							System.out.println("Friend Found!");
						}
						else {
							System.out.println("Friend not found.");
						}
					}
				}
				break;
			case 'Q':
				System.out.println("Exiting.");
				break;
			default:
				System.out.println("Invalid selection.");
				break;
			}
		} while (choice != 'Q');
		System.exit(0);

	}		
	private static void getInterest() {
		System.out.println("Choose an account. Enter a number between 0 and " + (accounts.size() - 1));
		int acctNumber = kb.nextInt();
		kb.nextLine();
		Account acct= accounts.get(acctNumber);
		if (acct instanceof InvestmentAccount) {
			((InvestmentAccount)acct).accrueInterest();
		}
		
	}

	public static void addAccount() {
		char choice;

		System.out.println("'C'hecking, 'B'asic Investment, 'M'oney Market, 'S'avings");
		choice = kb.nextLine().toUpperCase().charAt(0);
		switch (choice) {
		case 'C':
			CheckingAccount checking= new CheckingAccount("1", 5000.00, 30, 5.00);
			accounts.add(checking);
			System.out.println("Checking Account number "+checking.getAcctNumber()+"added.");
			break;
		case 'B':
			InvestmentAccount investment= new InvestmentAccount(5000.00, "2", .25, .03);
			accounts.add(investment);
			System.out.println("Investment Account number "+investment.getAcctNumber()+"added.");
			break;
		case 'M':
			MoneyMarketAccount moneyMarket= new MoneyMarketAccount(5000.00, "3", .20, .04, 200.00);
			accounts.add(moneyMarket);
			System.out.println("Money Market Account number "+moneyMarket.getAcctNumber()+"added.");
			break;
		case 'S':
			SavingsAccount savings = new SavingsAccount(5000.00, "4", .25);
			System.out.println("Savings number "+savings.getAcctNumber()+"added.");
			accounts.add(savings);
			break;
		default:
			System.out.println("Invalid selection.");
			break;
		}
	}

	public static void deposit() {
		System.out.println("Choose an account. Enter a number between 0 and " + (accounts.size() - 1));
		int acctNumber = kb.nextInt();
		kb.nextLine();
		System.out.println("Enter an ammount");
		double amt = kb.nextDouble();
		kb.nextLine();
		Account currAcct=accounts.get(acctNumber);
		boolean result= currAcct.deposit(amt);
		if(result==true) {
			System.out.println("Deposit Completed");
		}
		else {
			System.out.println("Deposit Failed");
		}
	}

	public static void withdraw() {
		System.out.println("Choose an account. Enter a number between 0 and " + (accounts.size() - 1));
		int acctNumber = kb.nextInt();
		kb.nextLine();
		System.out.println("Enter an ammount");
		double amt = kb.nextDouble();
		kb.nextLine();
		Account currAcct=accounts.get(acctNumber);
		boolean result= currAcct.withdraw(amt);
		if(result==true) {
			System.out.println("Withdrawal Completed");
		}
		else {
			System.out.println("Withdrawal Failed");
		}
	}

	public static void displayBalance() {
		System.out.println("Total of all 'C'hecking, 'S'avings, 'M'oney Market, 'B'asic Investment, or 'A'll?");
		char choice = kb.nextLine().toUpperCase().charAt(0);
		double total = 0;
		
			switch(choice) {
			case 'C':
				for(int x=0; x<accounts.size(); x++) {
					if (accounts.get(x) instanceof CheckingAccount) {
						total+=accounts.get(x).getBalance();
					}
				}
				break;
			case 'S':
				for(int x=0; x<accounts.size(); x++) {
					if (accounts.get(x) instanceof SavingsAccount) {
						total+=accounts.get(x).getBalance();
					}
				}
				break;
			case 'M':
				for(int x=0; x<accounts.size(); x++) {
					if (accounts.get(x) instanceof MoneyMarketAccount) {
						total+=accounts.get(x).getBalance();
					}
				}
				break;
			case 'B':
				for(int x=0; x<accounts.size(); x++) {
					if (accounts.get(x) instanceof InvestmentAccount) {
						total+=accounts.get(x).getBalance();
					}
				}
				break;
			case 'A':
				for(int x=0; x<accounts.size(); x++) {
					total+=accounts.get(x).getBalance();
				}
				break;
			default:
				System.out.println("Invalid Selection.");
				break;
			}
		System.out.println("Total Balance: " + total);
	}

	static void transfer() {
		System.out.println(
				"Choose an account to transfer from." + " Enter a number between 0 and " + (accounts.size() - 1));
		int fromAcct = kb.nextInt();
		kb.nextLine();
		System.out.println(
				"Choose an account to transfer to." + " Enter a number between 0 and " + (accounts.size() - 1));
		int toAcct = kb.nextInt();
		kb.nextLine();
		System.out.println("Enter an amount");
		double amt = kb.nextDouble();
		kb.nextLine();
		boolean result;
		result=accounts.get(fromAcct).withdraw(amt);
		result=accounts.get(toAcct).deposit(amt);
		if(result==false) {
			System.out.println("Transfer Failed.");
		}
		else {
			System.out.println("Transfer Completed.");
		}
	}
}
