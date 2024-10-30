package laços;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int backends = 0;
		int frontMulher = 0;
		int mobileHomem = 0;
		int fullStackNaoBinario = 0;
		int responderam = 0;
		int somaIdade = 0;
		
		boolean continuar = true;
		while(continuar) {
			System.out.print("Idade: ");
			int idade = scan.nextInt();
			System.out.print("Identidade de Genero: \n"
					+ "° 1 – Mulher Cis\n"
					+ "° 2 – Homem Cis\n"
					+ "° 3 – Não Binário\n"
					+ "° 4 – Mulher Trans\n"
					+ "° 5 – Homem Trans\n"
					+ "° 6 – Outros\n"
					+ "");
			int identidade = scan.nextInt();
			System.out.print("Pessoa Desenvolvedora (Número Inteiro):\n"
					+ "1 – Backend\n"
					+ "2 – Frontend\n"
					+ "3 – Mobile\n"
					+ "4 – FullStack\n"
					+ "");
			int desenvolvedor = scan.nextInt();
			if(desenvolvedor == 1) backends ++;
			if((identidade == 1 || identidade == 4) && desenvolvedor == 2) frontMulher++;
			if((identidade == 2 || identidade == 5) && desenvolvedor == 3 && idade > 40) mobileHomem++;
			if(identidade == 3 && desenvolvedor == 4 && idade < 30) fullStackNaoBinario++;
			
			responderam ++;
			somaIdade = somaIdade + idade;
			
			System.out.print("Deseja continuar (S/N):");
			String comando = scan.next();
			if(comando.toUpperCase().equals("S")) continuar = true;
			else if(comando.equals("N")) 
				{
				System.out.println("Encerrando.");
				continuar = false;
				}
			else {
				System.out.println("Valor invalido.");
				break;
			}
		}
		scan.close();
		double idadeTotal = somaIdade;
		double mediaIdade = idadeTotal /responderam; 
		
		System.out.println("Total de pessoas desenvolvedoras Backend: "
				+ backends
				+ "\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: "
				+ frontMulher
				+ "\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "
				+ mobileHomem
				+ "\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "
				+ fullStackNaoBinario
				+ "\nO número total de pessoas que responderam à pesquisa: "
				+ responderam
				);
		System.out.printf(Locale.US, "A média de idade das pessoas que responderam à pesquisa: %.2f"
				,mediaIdade);
	}
}
