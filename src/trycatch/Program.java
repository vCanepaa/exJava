package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	try {	
		System.out.println("Digite: ");
		String[] vect = sc.nextLine().split(" ");
		System.out.println("Digite a posicao ");
		int n = sc.nextInt();
		System.out.println(vect[n]);
	}catch(IndexOutOfBoundsException e) {
		System.out.println("Posicao invalida");
	}catch(InputMismatchException e) {
		System.out.println("Erro de dados");
	}
	
		System.out.println("Fim");
	}

}
