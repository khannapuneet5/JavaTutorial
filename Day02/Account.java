public class Account{
	private long accountNumber;
	private double balance;

	public Account(long theAccountNumber){
		this.accountNumber = theAccountNumber;
		this.balance = 1000;
	}

	public void deposit(double depositedAmount){
		balance += depositedAmount;
	}

	public void withdraw(double withdrawnAmount){
		if (balance - withdrawnAmount >= 1000){
			balance -= withdrawnAmount;
		}
	}

	public double getBalance(){
		return this.balance;
	}
}