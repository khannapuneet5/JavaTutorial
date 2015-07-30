public class Account{
	private long accountNumber;
	private double balance;

	public Account(int theAccountNumber){
		this.accountNumber = theAccountNumber;
		this.balance = 0;
	}
	
	public void deposit(double depositAmount){
		if (depositAmount + balance < 1000){
			System.out.println("Minimum balance to be added is 1000");
		}
		else{
			balance += depositAmount;
		}
	}

	public void withdraw(double withdrawAmount){
		if (balance - withdrawAmount < 1000){
			System.out.println("Can't withdraw " + withdrawAmount + ". Balance can't be less than 1000");
		}
		else{
			balance -= withdrawAmount;
		}
	}

	public double getBalance(){
		return this.balance;
	}
}