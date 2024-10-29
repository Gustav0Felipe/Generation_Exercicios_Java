package condicionais.switchs;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome do colaborador: ");
		String nome = scan.nextLine();
		System.out.print("Cargo: ");
		int codigo = scan.nextInt();
		System.out.print("Salário: ");
		float salario = scan.nextFloat();
		scan.close();
		
		switch(codigo) {
		case 1:
			System.out.printf(Locale.US, 
					"Nome do colaborador: " + nome + "\nCargo: Gerente" + "\nSalário: R$ %.2f", (salario + (0.1 * salario)));
			break;
		case 2:
			System.out.printf(Locale.US, 
					"Nome do colaborador: " + nome + "\nCargo: Vendedor" + "\nSalário: R$ %.2f", (salario + (0.07 * salario)));
			break;
		case 3:
			System.out.printf(Locale.US, 
					"Nome do colaborador: " + nome + "\nCargo: Supervisor" + "\nSalário: R$ %.2f", (salario + (0.09 * salario)));
			break;
		case 4:
			System.out.printf(Locale.US, 
					"Nome do colaborador: " + nome + "\nCargo: Motorista" + "\nSalário: R$ %.2f", (salario + (0.06 * salario)));
			break;
		case 5:
			System.out.printf(Locale.US, 
					"Nome do colaborador: " + nome + "\nCargo: Estoquista" + "\nSalário: R$ %.2f", (salario + (0.05 * salario)));
			break;
		case 6:
			System.out.printf(Locale.US, 
					"Nome do colaborador: " + nome + "\nCargo: Técnico de TI" + "\nSalário: R$ %.2f", (salario + (0.08 * salario)));
			break;
		}
	}
	
}
