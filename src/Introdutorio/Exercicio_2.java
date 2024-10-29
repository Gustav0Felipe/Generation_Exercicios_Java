package Introdutorio;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		
		//Exemplo dado no Exercicio
		float nota1 = 10f;
		float nota2 = 8f;
		float nota3 = 7f;
		float nota4 = 7.5f;
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		String resultado = String.format("%.2f", media).replace(",", ".");
		System.out.println("A media é: " + resultado);
		
		//Versão com você podendo escolher os valores
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Valor de Nota 1: ");
		nota1 = scan.nextFloat();
		System.out.print("Valor de Nota 2: ");
		nota2 = scan.nextFloat();
		System.out.print("Valor de Nota 3: ");
		nota3 = scan.nextFloat();
		System.out.print("Valor de Nota 4: ");
		nota4 = scan.nextFloat();
		scan.close();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		resultado = String.format("%.2f", media).replace(",", ".");
		System.out.print("A media é: " + resultado);
		}
}
