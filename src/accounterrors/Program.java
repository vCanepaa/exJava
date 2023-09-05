package accounterrors;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Account Number");
		int number = sc.nextInt();
		System.out.println("Initial balance: ");
		Double iBalance = sc.nextDouble();
		System.out.println("Limit: ");
		Double limit = sc.nextDouble();
		
		Account c1 = new Account(number,name,iBalance,limit);
		
		System.out.println("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		try {
			c1.withDraw(amount);
		}catch(BalanceException e) {
			System.out.println(e.getMessage());
		}catch(LimitError e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Balance: $"+ c1.getBalance());
		
	}

}
