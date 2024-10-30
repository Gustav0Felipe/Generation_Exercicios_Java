package laços;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		
		boolean continuar = true;
		do {
			System.out.printf("Digite um número: ");
			int numero = scan.nextInt();
			
			if(numero > 0) soma = soma + numero;
			else if(numero == 0) continuar = false;
			
		}while(continuar);
		
		scan.close();
		System.out.println("A soma dos números positivos é: " + soma);
	}
}
