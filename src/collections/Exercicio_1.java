package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1 {

	
	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 5 Cores: ");
		for(int i = 0; i < 5; i++) {
			cores.add(scan.nextLine());
		}
		scan.close();
		
		System.out.println("\nListar todas as cores: ");
		for(String cor : cores) {
			System.out.println(cor);
		}
		cores.sort(null);
		System.out.println("\nOrdenar todas as cores: ");
		for(String cor : cores) {
			System.out.println(cor);
		}
	}
}
