package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int numero = scan.nextInt();
		scan.close();
		
		//Versão sem o Iterator, no enunciado pede laços de repetição então fiz das 2 formas.
		if(numeros.contains(numero))System.out.println("O número " + numero + " foi encontrado! (Usando contains)");
		else System.out.println("O número " + numero + " não foi encontrado!");
		
		//Com Iterator e Laços de Repetição.
		Iterator<Integer> iterator = numeros.iterator();
		boolean encontrado = false;
		while(iterator.hasNext()) {
			if(numero == iterator.next()) {
				encontrado = true;
			}
		}
		if(encontrado)System.out.println("O número " + numero + " foi encontrado! (Usando iterator)");
		else System.out.println("O número " + numero + " não foi encontrado!");
	}
}
