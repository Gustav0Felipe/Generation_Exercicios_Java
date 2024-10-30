package laços;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		int contador = 0;
		
		boolean continuar = true;
		do {
			System.out.printf("Digite um número: ");
			int numero = scan.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				contador++;
				soma = soma + numero;
			}
			else if(numero == 0) continuar = false;
			
			
		}while(continuar);
		
		scan.close();
		System.out.print("A média de todos os números múltiplos de 3 é: " + soma/contador);
	}
}
