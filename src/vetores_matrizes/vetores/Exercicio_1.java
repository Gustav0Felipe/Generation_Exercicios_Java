package vetores_matrizes.vetores;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int numero = scan.nextInt();
		boolean localizado = false;
		scan.close();
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == numero) {
				System.out.print("O número " + numero + " está localizado na posição: " + i );
				localizado = true;
				return;
			}
		}
		if(!localizado) {
			System.out.print("O número " + numero + " não foi encontrado!");
		}
	}
}
