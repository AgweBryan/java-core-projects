
public class BankAccountSystem {

	public static void main(String[] args) {
		// Create a bank account for tommy and deposit $500.0
		BankAccount tommy = new BankAccount("Tommy");
		tommy.deposit(500.0);
		
		// Create a bank account for john and deposit $200.0
		BankAccount john = new BankAccount("John");
		john.deposit(200.0);
		
		// Transfer $100.0 from tommy's account to john's account
		tommy.transfer(100.0, john);
		
		// try to withdraw $50 from john's account
		john.withdraw(50.0);
		// try to withdraw $600.0 from john's account
		john.withdraw(600.0);
		System.out.println(john.getBalance());
		
		System.out.println();
		
		System.out.println(tommy.toString());
		System.out.println();
		System.out.println(john.toString());

	}

}
