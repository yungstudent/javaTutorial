public class SavingsAccount {
	// properties of the class...
	private int balance;
	
	// Constructors
	public SavingsAccount() {
		balance = 0;
	}	
	public SavingsAccount(int initialBalance) { 
		balance = initialBalance;
	}

	// Methods
	public void greet() {
		System.out.println("Welcome to your savings account.");
	}
	public void showBalance(){
		System.out.println("Your balance is " + balance);
	}
	public void deposit(int howMuch) {
		if (howMuch < 0){
			System.out.println("You cannot deposit a negative amount.");
		}
		else {
			balance = balance + howMuch;
		}
	}
	public void withdraw(int howMuch) { 
		if (howMuch < 0){
			System.out.println("You cannot deposit a negative amount.");
		}
		else {
			balance = balance - howMuch;
		}
	}
}
