package laços;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int pares = 0;
		int impares = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "° número: ");
			int numero = scan.nextInt();
			
			if(numero % 2 == 0) pares++;
			else impares++;
		}
		scan.close();
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números impares: " + impares);
	}
}
