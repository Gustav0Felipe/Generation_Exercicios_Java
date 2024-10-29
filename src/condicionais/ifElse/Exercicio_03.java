package condicionais.ifElse;

import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o Nome do doador: ");
		String nome = scan.nextLine();
		
		System.out.print("Digite a Idade do doador: ");
		int idade = scan.nextInt();
		
		System.out.print("Primeira doação de sangue? ");
		boolean primeiraDoacao = scan.nextBoolean();
		
		scan.close();
		
		if(idade >= 18 && idade < 60) System.out.println(nome + " esta ápto a doar sangue!");
		else if(idade >= 60 && idade <= 69 && !primeiraDoacao) System.out.println(nome + " esta ápto a doar sangue!");
		else System.out.println(nome + " não esta ápto a doar sangue!");
	}
}
