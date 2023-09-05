package herancaex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos funcionarios vao ser cadastrados?");
		int n = sc.nextInt();
		for(int i = 0; i<n;i++) {
			Funcionario f;
			System.out.println("Funcionario #" + (i+1));
			System.out.println("Esse funcionario é terceirizado? (S-N) ");
			char op = sc.next().charAt(0);
			if(op == 'n'|| op == 'N') {
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Quantas horas foram trabalhadas? ");
			int horas = sc.nextInt();
			System.out.println("Quanto esse funcionario ganha por hora? ");
			double valor = sc.nextDouble();
			f = new Funcionario(nome,horas,valor);
			}else{
				System.out.println("Nome: ");
				String nome = sc.next();
				System.out.println("Quantas horas foram trabalhadas? ");
				int horas = sc.nextInt();
				System.out.println("Quanto esse funcionario ganha por hora? ");
				double valor = sc.nextDouble();
				System.out.println("Qual foi a despesa adicional? ");
				double desp = sc.nextDouble();
				f = new FuncionarioTerc(nome, horas, valor, desp);
				
			}
			
			funcionarios.add(f);
		}
		
		System.out.println("PAGAMENTOS: ");
		for(Funcionario f : funcionarios) {
			System.out.println(f.toString());
		}
	}

}
