package composicao;

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
		
		
		System.out.println("Entre com o nome do Departamento: ");
		String depName = sc.next();
		System.out.println("Digite os dados do trabalhador: ");
		System.out.println("NOME: ");
		String name = sc.next();
		System.out.println("LEVEL: ");
		String level = sc.next();
		System.out.println("SALARIO: ");
		Double salario = sc.nextDouble();
		
		Worker trab = new Worker(name, WorkerLevel.valueOf(level), salario, new Department(depName));
		
		System.out.println("Quantos contratos esse trabalhador tem? ");
		int n = sc.nextInt();
		for(int i =0; i<n; i++) {
			System.out.println("Entre com os dados do contrato #"+ (i+1));
			System.out.println("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			Double valor = sc.nextDouble();
			System.out.println("Duracao(horas): ");
			Integer horas = sc.nextInt();
			trab.addContract(new HourContract(dataContrato ,valor,horas));
		}
		System.out.println("Digite o mes e o ano para calcular o valor total recebido: (MM/YYYY)");
		String meseAno = sc.next();
		int mes = Integer.parseInt(meseAno.substring(0,2));
		int ano = Integer.parseInt(meseAno.substring(3));
		
		System.out.println("NOME: "+ trab.getName());
		System.out.println("DEPARTAMENTO: "+ trab.getDepartment().getName());
		System.out.println("VALOR RECEBIDO EM "+ meseAno+ ": "+ String.format("%.2f", trab.income(ano, mes)));
		
		
		
		
		sc.close();
	}

}
