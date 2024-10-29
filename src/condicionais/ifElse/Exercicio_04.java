package condicionais.ifElse;
import java.util.Scanner;
public class Exercicio_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Seu animal é vertebrado ou invertebrado?: ");
		String vertebra = scan.nextLine();
		
		System.out.print("Seu animal é uma ave, mamífero, inseto ou anelídeo?: ");
		String tipo = scan.nextLine();
		
		if(tipo.equals("ave"))System.out.print("Seu animal é carnívoro ou onívoro?: ");
		else if(tipo.equals("mamífero"))System.out.print("Seu animal é onívoro ou herbívoro?: ");
		else if(tipo.equals("inseto"))System.out.print("Seu animal é hematófago ou herbívoro?: ");
		else if(tipo.equals("anelídeo"))System.out.print("Seu animal é hematófago ou onívoro?: ");
		else {
			System.out.println("Tipo invalido");
			scan.close();
			return;
		}
		String alimentacao = scan.nextLine();
		scan.close();
		if(vertebra.equals("vertebrado")) {
			if(tipo.equals("ave") && alimentacao.equals("carnívoro")) System.out.println("Águia"); 	
			else if(tipo.equals("ave") && alimentacao.equals("onívoro")) System.out.println("Pomba") ;
			else if(tipo.equals("mamífero") && alimentacao.equals("onívoro")) System.out.println("Homem");
			else if(tipo.equals("mamífero") && alimentacao.equals("herbívoro")) System.out.println("Vaca");
			else System.out.println("Nenhum dos animais.");
		}
		else if(vertebra.equals("invertebrado")) {
			if(tipo.equals("inseto") && alimentacao.equals("hematófago")) System.out.println("Pulga");
			else if(tipo.equals("inseto") && alimentacao.equals("herbívoro")) System.out.println("Lagarta");
			else if(tipo.equals("anelídeo") && alimentacao.equals("hematófago")) System.out.println("Sanguessuga");
			else if(tipo.equals("anelídeo") && alimentacao.equals("onívoro")) System.out.println("Minhoca");
			else System.out.println("Nenhum dos animais.");
		}
		else System.out.println("Nenhum dos animais.");
	}
}
