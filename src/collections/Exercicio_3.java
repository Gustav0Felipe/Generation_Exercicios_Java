package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<>();
		
		System.out.println("Digite 10 numeros: ");
		for(int i = 0; i < 10; i++) {
			numeros.add(scan.nextInt());
		}
		scan.close();
		
		Iterator<Integer> set = numeros.iterator();
		System.out.println("Listar dados do Set: ");
		while(set.hasNext()) {
			System.out.println(set.next());
		}
		
	}
}
