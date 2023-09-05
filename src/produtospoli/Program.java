package produtospoli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> produtos = new ArrayList<>();
		
		System.out.println("Quantos produtos serão registrados? ");
		int n = sc.nextInt();
		for(int i = 0; i< n; i++) {
			Product produto;
			System.out.println("Produto #"+ (i+1));
			System.out.println("Comum, usado ou importado? (c/u/i)");
			char p = sc.next().charAt(0);
			if(p == 'c' || p =='C') {
				System.out.println("Nome: ");
				String nome = sc.next();
				System.out.println("Preco: ");
				Double preco = sc.nextDouble();
				produto = new Product(nome,preco);
				produtos.add(produto);
			}else if(p == 'i'|| p == 'I') {
				System.out.println("Nome: ");
				String nome = sc.next();
				System.out.println("Preco: ");
				Double preco = sc.nextDouble();
				System.out.println("Taxa de alfandega: ");
				Double taxa = sc.nextDouble();
				produto = new ImportedProduct(nome,preco,taxa);
				produtos.add(produto);
			}else if(p == 'u'|| p=='U') {
				System.out.println("Nome: ");
				String nome = sc.next();
				System.out.println("Preco: ");
				Double preco = sc.nextDouble();
				System.out.println("Data de manufatura: ");
				Date mDate = sdf.parse(sc.next());
				produto = new UsedProduct(nome,preco,mDate);
				produtos.add(produto);
			}else {
				System.out.println("Opcao invalida!");
			}
			
		}
		System.out.println("Price tags: ");
		for(Product p : produtos) {
			System.out.println(p.priceTag());
		}
		
		
		
		sc.close();
	}

}
