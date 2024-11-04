package queue_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex_Queue {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();
		
		boolean exit = false;
		System.out.println("*".repeat(50) + "\n"
				+("1 - Adicionar Cliente na Fila\n"
				+ "2 - Listar todos os Clientes\n"
				+ "3 - Retirar Cliente da Fila \n"
				+ "0 - Sair \n").indent(9)
				+ "*".repeat(50));
		while(!exit) {
			System.out.print("\nEntre com a opção desejada: ");
			int escolha = scan.nextInt();
			scan.nextLine();//não deixando o Scan passar o valor enter para o proximo scan, geraria um bug no proximo nextLine().
			switch(escolha) {
			case 1: 
				System.out.print("Nome do Cliente: ");
				String nome = scan.nextLine();
				clientes.add(nome);
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				if(clientes.isEmpty()) System.out.println("A Fila está vazia!");
				else {
					System.out.println("Fila: \n");
					for(String cliente : clientes) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if(clientes.isEmpty()) System.out.println("A Fila está vazia!");
				else {
					System.out.println("O Cliente foi Chamado!");
					clientes.remove();
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
