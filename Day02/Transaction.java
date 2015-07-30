public class Transaction{
	private int month;
	private String userAction;
	private double balanceAmount;
	public Transaction(int theMonth, String theUserAction, double theBalanceAmount){
		this.month = theMonth;
		this.userAction = theUserAction;
		this.balanceAmount = theBalanceAmount;
	}

	public String getMonth(){
		return Calendar.getInstance().get(Calendar.MONTH);
	}

	public String getUserAction(){
		return userAction;
	}

	public double getBalanceAmount(){
		return balanceAmount;
	}
}