package main;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {

		//Exemplo dado no exercicio.
		float salarioBruto = 2000;
		float adicionalNoturno = 500;
		float horasExtras = 100;
		float descontos = 200; 
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		String resultado = String.format("%.2f",salarioLiquido).replace(",", ".");
		System.out.print("O Salário Liquido é: " + resultado);

		//Versão onde você pode digitar os valores.
		Scanner scan = new Scanner(System.in);
		System.out.print("\nDigite o Salário Bruto: ");
		salarioBruto = scan.nextFloat();
		System.out.print("Digite o Adicional Noturno: ");
		adicionalNoturno = scan.nextFloat();
		System.out.print("Digite as Horas Extras: ");
		horasExtras = scan.nextFloat();
		System.out.print("Digite os Descontos: ");
		descontos = scan.nextFloat();
		scan.close();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		resultado = String.format("%.2f",salarioLiquido).replace(",", ".");
		System.out.print("O Salário Liquido é: " + resultado);
	}
}
