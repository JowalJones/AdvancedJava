package bankaccount;

public class BankAccount {

		
		private double balance;
		
		//Constructor
		public BankAccount () {
			balance = 0.0;
		}
		
		//deposit method
		public void deposit (double amount) {
			balance = balance +amount;
		}
		
		//withdraw method
		public void withdraw (double amount) throws InsufficientFundException {
			if (amount > balance) {
				throw new InsufficientFundException ("Insufficient funds in your Account! Cannot Withdraw!");
				
			}
			balance = balance - amount;
		}

		public double getBalance() {
			return balance;
		}

	}


