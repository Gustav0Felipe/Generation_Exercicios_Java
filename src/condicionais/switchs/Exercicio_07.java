package condicionais.switchs;

import java.util.Scanner;

public class Exercicio_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Digite o 1º número: ");
		float n1 = scan.nextFloat();
		
		System.out.print("Digite o 2º número: ");
		float n2 = scan.nextFloat();
		
		System.out.print("Operação: ");
		int op = scan.nextInt();  
		scan.close();
		
		switch(op) {
			case 1:
				System.out.print(n1 + " + " + n2 + " = " + (n1 + n2));
				break;
			case 2:
				System.out.print(n1 + " - " + n2 + " = " + (n1 - n2));
				break;
			case 3:
				System.out.print(n1 + " * " + n2 + " = " + (n1 * n2));
				break;
			case 4:
				System.out.print(n1 + " / " + n2 + " = " + (n1 / n2));
				break;
			default: 
				System.out.println("Operação Inválida!");
		}
	}
}
