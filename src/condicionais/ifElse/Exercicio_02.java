package condicionais.ifElse;

import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		scan.close();
		
		String sinal = "positivo!";
		if(numero < 0) sinal = "negativo!";		
		
		if(numero % 2 == 0) System.out.println("O Número " + numero + " é par e " + sinal);
		else System.out.println("O Número " + numero + " é impar e " + sinal);
		
	}
}
