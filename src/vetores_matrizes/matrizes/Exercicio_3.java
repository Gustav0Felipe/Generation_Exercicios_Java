package vetores_matrizes.matrizes;


public class Exercicio_3 {
	public static void main(String[] args) {
		int [][] matriz = new int[3][3];
		int valor = 1;
		int soma_principal = 0;
		int soma_secundaria = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = valor++;
			}
		}
		
		System.out.println("Elementos da Diagonal Principal: ");
		for(int indice = 0; indice < matriz.length; indice++) {
			System.out.print(matriz[indice][indice] + " ");
			soma_principal += matriz[indice][indice];
		}
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		int ultima_coluna = matriz.length - 1;
		for(int linha = 0; linha < matriz.length; linha++) {
			System.out.print(matriz[linha][ultima_coluna - linha] + " ");
			soma_secundaria += matriz[linha][ultima_coluna - linha];
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: \n" + soma_principal);
		
		System.out.println("Soma dos Elementos da Diagonal Secundária: \n" + soma_secundaria);
	}
}
