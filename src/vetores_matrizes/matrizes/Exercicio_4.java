package vetores_matrizes.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		float [] [] notas = new float[10][4];
		float [] medias = new float[10];
		//Usados os mesmos numeros do Exemplo.
		for(int linha = 0; linha < notas.length; linha++) {
			System.out.println("\nNotas aluno " + (linha + 1) +": ");
			for(int coluna = 0; coluna < 4; coluna++) {
				System.out.print(coluna + 1 + "° Bimestre: ");
				notas[linha][coluna] = scan.nextFloat();
			}
		}
		scan.close();
		
		for(int indice = 0; indice < medias.length; indice++) {
			float soma = 0;
			for(int coluna = 0; coluna < 4; coluna++) {
				soma += notas[indice][coluna];
			}
			float media = soma/4;
			medias[indice] = media;
		}
		
		System.out.println("\nMedia alunos de 1 a 10: ");
		for(int indice = 0; indice < medias.length; indice++) {
			System.out.printf(Locale.US, "[ %.1f ]", medias[indice]);
		}
	}
}
