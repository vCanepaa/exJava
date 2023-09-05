package reservas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date checkin;
		Date checkout;
		
		System.out.println("Digite o quarto: ");
		String quarto = sc.next();
		if(!quarto.matches("[0-9]+")) {
			System.out.println("O quarto deve ser um numero");
		}else {
			System.out.println("Digite a data de checkin");
			checkin = sdf.parse(sc.next());
			System.out.println("Digite a data de checkout");
			checkout = sdf.parse(sc.next());
			Date agr = new Date();
			if(checkin.before(agr)||checkout.before(agr)) {
				System.out.println("Data invalida");
			}
		}
	}

}
