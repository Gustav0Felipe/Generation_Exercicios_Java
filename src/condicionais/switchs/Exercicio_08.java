package condicionais.switchs;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Operação: ");
		int codigo = scan.nextInt();
		float saldo = 1000;
		float valor;
		
		switch(codigo) {
		case 1:
			System.out.printf(Locale.US, "Operação - Saldo \nSaldo: R$ %.2f", saldo);
			break;
		case 2:
			System.out.print("Valor: ");
			valor = scan.nextFloat();
			if(saldo >= valor) System.out.printf(Locale.US, "Operação - Saque \nNovo Saldo: R$ %.2f", (saldo - valor));
			else System.out.println("Saldo Insuficiente");
			break;
		case 3:
			System.out.print("Valor: ");
			valor = scan.nextFloat();
			System.out.printf(Locale.US, "Operação - Deposito \nNovo Saldo: R$ %.2f", (saldo + valor));
			break;
		default:
			System.out.println("Operação Inválida!");
			break;
		}
		scan.close();
	}
}
