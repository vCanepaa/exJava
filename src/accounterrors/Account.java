package accounterrors;

public class Account {
	private int number;
	private String name;
	private Double balance;
	private Double wLimit;
	
	public Account() {
		
	}

	public Account(int number, String name, Double balance, Double wLimit) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.wLimit = wLimit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getwLimit() {
		return wLimit;
	}
	
	public void withDraw(Double w) throws BalanceException, LimitError {
		if(w>this.balance) {
			throw new BalanceException("Not enough balance");
		}else if(w>this.wLimit) {
			throw new LimitError("The amount exceeds withdraw limit");
		}else {
			this.balance -= w;
		}
	}
	public void deposit(Double w) {
		this.balance += w;
	}
	
}
