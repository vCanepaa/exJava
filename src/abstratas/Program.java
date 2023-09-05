package abstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		Locale.setDefault(Locale.US);
		
		System.out.println("O numero de pagadores de impostos");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("Pessoa fisica ou juridica? (f/j)");
			char op = sc.next().charAt(0);
			if(op == 'f'|| op == 'F') {
				System.out.println("Digite o nome da pessoa: ");
				String nome = sc.next();
				System.out.println("Digie a renda anual: ");
				Double rendaA = sc.nextDouble();
				System.out.println("Digite os gastos com saude: ");
				Double gastos = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome,rendaA,gastos));
			}else if(op == 'j' || op == 'J') {
				System.out.println("Digite o nome da Empresa: ");
				String nome = sc.next();
				System.out.println("Digie a renda anual: ");
				Double rendaA = sc.nextDouble();
				System.out.println("Digite a quantidade de funcionarios: ");
				int func = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome,rendaA,func));
			}else {
				System.out.println("Opcao invalida");
			}
		
		}
		System.out.println("Taxas pagas: ");
		double soma = 0.0;
		for(Pessoa p: pessoas) {
			System.out.println(p.getNome() + ": $ "+ p.calcImposto());
			soma+= p.calcImposto();
		}
		System.out.println("TOTAL PAGO: "+ soma);
		sc.close();	}

}
