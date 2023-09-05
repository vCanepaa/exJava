package pedidoscompex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do Cliente:");
		System.out.println("NOME: ");
		String name = sc.next();
		System.out.println("EMAIL: ");
		String email = sc.next();
		System.out.println("Data de Nascimento (DD/MM/YYYY): ");
		Date nasc = sdf.parse(sc.next());
		Client c1 = new Client(name,email,nasc);
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.println("STATUS: ");
		String status = sc.next();
		Order order = new Order(new Date(), OrderStatus.valueOf(status));
		order.addClient(c1);
		
		System.out.println("Quantos items havera nesse pedido?: ");
		int n = sc.nextInt();
		for(int i = 0; i<n;i++) {
			System.out.println("Entre com os dados do #"+ (i+1) + "ITEM:");
			System.out.println("Nome do produto: ");
			String pName = sc.next();
			System.out.println("PREÇO: ");
			Double price = sc.nextDouble();
			System.out.println("QUANTIDADE: ");
			int q = sc.nextInt();
			OrderItem oI = new OrderItem(q, price);
			Product p = new Product(pName, price);
			
			oI.addProduto(p);
			order.addItem(oI);
		}
		System.out.println(order.toString());
		sc.close();
		}
}
