package condicionais.switchs;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Codigo do Produto: ");
		int codigo = scan.nextInt(); 
		
		System.out.print("Quantidade: ");
		int quantidade = scan.nextInt();
		scan.close();
		
		switch(codigo) {
		case 1:
			System.out.printf(Locale.US,"Produto: Cachorro Quente \nValor Total: R$ %.2f", (quantidade * 10.00));
			break;
		case 2:
			System.out.printf(Locale.US,"Produto: X-Salada \nValor Total: R$ %.2f",(quantidade * 15.00));
			break;
		case 3:
			System.out.printf(Locale.US,"Produto: X-Bacon \nValor Total: R$ %.2f", (quantidade * 18.00));
			break;
		case 4:
			System.out.printf(Locale.US, "Produto: Bauru \nValor Total: R$ %.2f", (quantidade * 12.00));
			break;
		case 5:
			System.out.printf(Locale.US,"Produto: Refrigerante \nValor Total: R$ %.2f", (quantidade * 8.00));
			break;
		case 6:
			System.out.printf(Locale.US,"Produto: Suco de laranja \nValor Total: R$ %.2f", (quantidade * 13.00));
			break;
		}
	}
}
