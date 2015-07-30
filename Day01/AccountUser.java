public class AccountUser{
	
	public static void main(String[] args){
		Account account = new Account(213123213);
		account.deposit(500);
		account.withdraw(3500);
		System.out.println("Balance is : " + account.getBalance());
	}
}