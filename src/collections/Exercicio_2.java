package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número que você deseja encontrar: ");
		int numero = scan.nextInt();
		scan.close();

		//Versão usando diretamente ArrayList, poderia ter usado List também e era a boa pratica, mas quis fazer fiel ao exercicio.
		ArrayList<Integer> convertido = new ArrayList<>(Arrays.asList(2 ,5 ,1, 3 ,4 ,9 ,7 ,8 ,10 ,6));
		if(convertido.indexOf(numero) == -1) System.out.println("O número " + numero + " não foi encontrado!");
		else System.out.println("O número 7 está localizado na posição: " + convertido.lastIndexOf(numero) + " (Versão usando ArrayList.)");

		//Versão usando Collection e Iterator, achei interessante tentar.
		Collection<Integer> numeros = new ArrayList<>(Arrays.asList(2 ,5 ,1, 3 ,4 ,9 ,7 ,8 ,10 ,6));
		Iterator<Integer> iterator = numeros.iterator();
		int indice = 0;
		boolean encontrado = false;
		
		while(iterator.hasNext()) {
			if(iterator.next() == numero) {
				encontrado = true;
				break;
			}
			indice++;
		}
		if(encontrado)System.out.println("O número 7 está localizado na posição: " + indice + " (Versão usando Collection e Iterator.)");
		else System.out.println("O número " + numero + " não foi encontrado!");
	}
}