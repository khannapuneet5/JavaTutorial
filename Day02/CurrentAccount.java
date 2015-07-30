import java.util.Calendar;

public class CurrentAccount extends Account{
	private int numberOfWithdrawls = 0;
	private int currentMonth;

	private int fees;
	private static final double FEES_INTEREST = 0.0015;
	List<Transaction> list = null;

	public CurrentAccount(long accountNumber){
		super(accountNumber);
		List<Transaction> list = new ArrayList<Transaction>();
	}

	private void calculateFees(double withdrawnAmount){
		if (numberOfWithdrawls > 3){
				fees = withdrawnAmount*FEES_INTEREST;
		}
	}

	public void withdraw(double withdrawnAmount){
		int month = Calendar.getInstance(get(Calendar.MONTH));
		if (numberOfWithdrawls < 3){
			
			numberOfWithdrawls++;	
		}
		
		calculateFees(withdrawnAmount);
		if (numberOfWithdrawls > 3){
			balance -= fees;
		}
		super.withdraw(withdrawnAmount);
		Transaction t1 = new Transaction(month, "withdrawal", withdrawnAmount);
		list.add(t1);
	}

	public void deposit(double depositAmount){
		balance += depositedAmount;
		Transaction t1 = new Transaction(Calendar.getInstance().get(Calendar.MONTH)), "deposit", depositedAmount)
		list.add(t1);
	}
	public void printStatement(){
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Transaction tr = itr.next();
			System.out.println("Month : " + tr.getMonth() + " Action: " + tr.getUserAction() + " Amount : " + tr.getAmount());
		}
	}
}