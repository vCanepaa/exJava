package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Funcionario> list = new ArrayList<>();
		
		
		System.out.println("Quantos funcionarios vao ser registrados?");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("Qual o id do funcionario?");
			int id = sc.nextInt();
			if(hasId(list,id) != null) {
				System.out.println("Esse id ja existe");
			}else {
			
			System.out.println("Qual o nome do funcionario?");
			String nome = sc.next();
			System.out.println("Qual o salario do funcionario?");
			double sal = sc.nextDouble();
					
			Funcionario f = new Funcionario(id,nome,sal);
			list.add(f);
		}
			
		 }
			
		System.out.println("Informe o id do funcionario que recebera aumento:");
		int id = sc.nextInt();
		Integer position = hasId(list,id);
		if(position == null) {
			System.out.println("Id não existe");
		}else {
			System.out.println("Digite a porcentagem do aumento: ");
			double por = sc.nextDouble();
			list.get(position).Aumento(por);
		}
	
		for(Funcionario f: list) {
			System.out.println(f.toString());
		}
		sc.close();
	}
	
	
	public static Integer hasId(List<Funcionario> list, int id) {
		for(int i = 0; i<list.size(); i++) {
		 int idTemp = list.get(i).getId();
		 if(idTemp == id) {
			 return i;
		 }
		}
		return null;
	}
		
}


