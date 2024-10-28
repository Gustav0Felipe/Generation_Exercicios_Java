package main;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main (String [] args) {
		
		//Exemplo dado no Exercicio.
		float salario = 1000;
		float abono = 100;
		String resultado = String.format("%.2f", salario + abono).replace(",", ".");
		System.out.println("O Salário com abono é: " + resultado);
		
		//Versão onde você pode digitar os numeros
		System.out.print("Digite o Salário: ");
		Scanner scan = new Scanner(System.in);
		salario = scan.nextFloat();
		System.out.print("Digite o Abono: ");
		abono = scan.nextFloat();
		scan.close();
		
		resultado = String.format("%.2f", salario + abono).replace(",", ".");
		System.out.print("O salário com abono é: " + resultado);
		
	}
}
