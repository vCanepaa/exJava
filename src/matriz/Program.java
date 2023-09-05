package matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		System.out.println("Digite o numero de n:");
		n = sc.nextInt();
		System.out.println("Digite o numero de m: ");
		m = sc.nextInt();
	
		Integer[][] matriz = new Integer[n][m];
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<m; j++) {
				System.out.println("Digite o valor de "+ (i+1) + " " + (j+1));
				matriz[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<m; j++) {
				System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println("");
		}
		
		System.out.println("Digite o numero para buscar: ");
		int num = sc.nextInt();
		
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<m; j++) {
				if(matriz[i][j] == num) {
					System.out.println("Posição: " + (i+1) + ", " + (j+1));
					if(j-1 < 0) {
						System.out.println("Esquerda: não tem");
					}else {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if(j+1 >= m) {
						System.out.println("Direita: não tem ");

					}else {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if(i+1 >= n) {
						System.out.println("Abaixo: não tem ");

					}else {
					System.out.println("Abaixo: "+ matriz[i+1][j]);
					}
					if(i-1 < 0) {
						System.out.println("Acima: não tem ");

					}else {
						System.out.println("Acima: " + matriz[i-1][j]);
					}

				}
			}
		}
	sc.close();
	}
}
