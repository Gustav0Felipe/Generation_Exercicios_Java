package laços;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		int n1 = scan.nextInt();
		
		System.out.print("Digite o último número do intervalo: ");
		int n2 = scan.nextInt();
		scan.close();

		for(int i = n1 ; i <= n2; i++) {
			if(n1 > n2) {
				System.out.println("Intervalo inválido!");
				return;
			}
			if(i % 5 == 0 && i % 3 == 0) {
			System.out.println(i + " é múltiplo de 3 e 5");
			}
		}

	}
}
