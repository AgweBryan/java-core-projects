
public class BankAccount{
	private double balance;
	private String name;
	
	BankAccount(String name) {
		this.name = name;
		this.balance = 0.0;
		
	}
	
	// Deposit money into account
	public void deposit(double amount) {
		balance += amount;
		System.out.println(name + " has $" + balance);
	}
	
	// withdraw money from account
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println(name + " has $" + balance + " after withdrawal.");
		} else {
			System.out.println("Not enough balance in account for withdrawal :(");
		}
	}
	
	// Transfer money to account
	public void transfer(double amount, BankAccount acc) {
		if(balance < amount) {
			System.out.println("Not enough balance to perform transfer");
		}else {
			this.balance -= amount;
			acc.balance += amount;
			System.out.println(name + " transfered $" + amount + " --> " + acc.name);
			
		}
	}
	
	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		String accountDetails ="Account Details\n"
				+ "==================\n"
				+ "Owner: " + name + "\n"
				+ "Balance: $" + balance;
		return accountDetails;
	}


}
