package queue_stack;

import java.util.Scanner;
import java.util.Stack;

public class Ex_Stack {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		
		boolean exit = false;
		System.out.println("*".repeat(50) + "\n"
				+("1 - Adicionar Livro na Pilha\n"                                                    
				+ "2 - Listar todos os Livros\n"
				+ "3 - Retirar Livro da Pilha \n"
				+ "0 - Sair \n").indent(9)
				+ "*".repeat(50));
		while(!exit) {
			System.out.print("\nEntre com a opção desejada: ");
			int escolha = scan.nextInt();
			scan.nextLine();
			switch(escolha) {
			case 1: 
				System.out.print("Nome do Livro: ");
				String nome = scan.nextLine();
				livros.push(nome);
				System.out.println("Livro Adicionado!");
				break;
			case 2:
				if(livros.isEmpty()) System.out.println("A Pilha está vazia!");
				else {
					System.out.println("Lista de Livros na Pilha: ");
					for(String livro : livros) {
						System.out.println(livro);
					}
				}
				break;
			case 3:
				if(livros.isEmpty()) System.out.println("A Pilha está vazia!");
				else {
					System.out.println("Um Livro foi retirado da pilha!");
					livros.pop();
				}
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				exit = true;
				break;
			}
		}
		scan.close();
	}
}
