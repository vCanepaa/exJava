package secaodez;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alguel[] quartos = new Alguel[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int rent = sc.nextInt();
		for(int i = 0; i < rent; i++) {
			System.out.println("Qual nome do hospede?");
			String name = sc.next();
			System.out.println("Qual email do hospede?");
			String email = sc.next();
			System.out.println("Qual quarto o hospede deseja ficar? 1-10");
			int quarto = sc.nextInt();
			quartos[quarto] = new Alguel(name, email, i);
		}
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i]!= null) {
				System.out.println("Nome: " + quartos[i].getName());
				System.out.println("Email: "+ quartos[i].getEmail());
				System.out.println("Quarto: "+ i);
			}else {
				System.out.println("--QUARTO "+ i + " ESTA LIVRE");
			}
		}
		sc.close();
		
		
	}
}


