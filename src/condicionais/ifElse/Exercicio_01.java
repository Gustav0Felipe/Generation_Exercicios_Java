package condicionais.ifElse;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Digite o número A: ");
	int a = scan.nextInt();

	System.out.print("Digite o número B: ");
	int b = scan.nextInt();

	System.out.print("Digite o número C: ");	
	int c = scan.nextInt();

	scan.close();
	
	if(a + b > c) System.out.println(a + " + " + b + " = " + (a + b) + " > " + c + "\nA Soma de A + B é maior que C");
	else if(a + b == c) System.out.println(a + " + " + b + " = " + (a + b) + " = " + c + "\nA + B é igual a C");
	else System.out.println(a + " + " + b + " = " + (a + b) + " < " + c + "\nA + B é menor que C");

	
	}
	
}
