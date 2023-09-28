package exercicios._03;

import java.util.Scanner;

public class Resolucao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int produtoA;
		int produtoB;
		int produtoC;
		int produtoD;
		int diferenca;
		
		System.out.println("Calcular a diferença do produto de A e B pelo produto de C e D");
		
		System.out.println("");
		
		System.out.print("Informe o valor do produto A: ");
		produtoA = scanner.nextInt();
		
		System.out.print("Informe o valor do produto B: ");
		produtoB = scanner.nextInt();
		
		System.out.print("Informe o valor do produto C: ");
		produtoC = scanner.nextInt();
		
		System.out.print("Informe o valor do produto D: ");
		produtoD = scanner.nextInt();
		
		diferenca = produtoA * produtoB - produtoC * produtoD;
		
		System.out.println("");
		
		System.out.println("DIFERENÇA = " + diferenca);
		
		scanner.close();
	}

}
