package vetores_matrizes.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetor = new int[10];
		double soma = 0;
		double media = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor para o indice " + i + ": ");
			vetor[i] = scan.nextInt();
			soma = soma + vetor[i];
		}
		scan.close();
		System.out.println("Elementos nos índices ímpares: ");
		for(int i = 0; i < vetor.length; i++) {
			if(i % 2 != 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println("\nElementos pares: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		media = soma/vetor.length;
		System.out.printf(Locale.US, "\nSoma: " + soma + "\nMédia: %.2f", media);

	}
}
