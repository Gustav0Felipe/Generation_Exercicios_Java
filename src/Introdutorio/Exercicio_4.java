package Introdutorio;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		//Exemplo dado no exercicio.
		float n1 = 5;
		float n2 = 6;
		float n3 = 7;
		float n4 = 8; 
		
		float diferenca = (n1 * n2) - (n3 * n4);
		String resultado = String.format("%.2f", diferenca).replace(",", ".");
		
		System.out.println("A diferença é: " + resultado);

		//Versão onde você mesmo escolhe os numeros.
		Scanner scan = new Scanner(System.in);

		System.out.print("Valor de N1: ");
		n1 = scan.nextFloat();
		System.out.print("Valor de N2: ");
		n2 = scan.nextFloat();
		System.out.print("Valor de N3: ");
		n3 = scan.nextFloat();
		System.out.print("Valor de N4: ");
		n4 = scan.nextFloat();
		scan.close();
		
		diferenca = (n1 * n2) - (n3 * n4);
		resultado = String.format("%.2f", diferenca).replace(",", ".");

		System.out.println("A diferença com os numeros dados por você é: " + resultado);
	}
}
