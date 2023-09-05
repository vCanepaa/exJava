package heranca;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Robson", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Ana", 0.0, 500.0);
		
		//upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003,"Bob", 0.0, 100.0);
		Account acc3 = new SavingsAccount(1004,"John", 10.0, 5.0);
		
		
		// downcasting
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(10.0);
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
			System.out.println("LOAN");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc6 = (SavingsAccount)acc3;
			acc6.updateBalance();
			System.out.println("Update balance");
		}
	}

}
