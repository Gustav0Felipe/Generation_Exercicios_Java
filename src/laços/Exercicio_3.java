package laços;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menores21 = 0;
		int maiores50 = 0;
		
		while(true) {
			System.out.print("Digite uma idade: ");
			int idade = scan.nextInt();
			if(idade < 0) break;
			else if(idade < 21) menores21++;
			else if(idade > 50) maiores50++;
		}
		scan.close();
		System.out.println("Total de pessoas menores de 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
	}
}
