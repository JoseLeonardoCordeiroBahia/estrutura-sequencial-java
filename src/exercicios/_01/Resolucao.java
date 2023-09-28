package exercicios._01;

import java.util.Scanner;

public class Resolucao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.println("Soma de dois números");
		
		// Pula uma linha
		System.out.println("");
		
		System.out.print("Informe o primeiro número: ");
		numero1 = scanner.nextInt();
		
		
		System.out.print("Informe o segundo número: ");
		numero2 = scanner.nextInt();
		
		soma = numero1 + numero2;
		
		// Pula uma linha
		System.out.println("");
		
		System.out.println("SOMA = " + soma);
		
		scanner.close();
	}

}
