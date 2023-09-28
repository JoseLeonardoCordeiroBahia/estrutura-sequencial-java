package exercicios._05;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int codigoPeca1;
		int quantidadePeca1;
		double valorUnitarioPeca1;
		
		int codigoPeca2;
		int quantidadePeca2;
		double valorUnitarioPeca2;
		
		double valorTotalFinal;
		
		System.out.println("Calcular valor final a ser pago");
		
		System.out.println("");
		
		System.out.println("----> Peça 1 <----");
		System.out.print("Informe o código da peça 1: ");
		codigoPeca1 = scanner.nextInt();
		
		System.out.print("Informe a quantidade de peça 1: ");
		quantidadePeca1 = scanner.nextInt();
		
		System.out.print("Informe o valor unitário da peça 1: ");
		valorUnitarioPeca1 = scanner.nextDouble();
		
		System.out.println("");
		
		System.out.println("----> Peça 2 <----");
		System.out.print("Informe o código da peça 2: ");
		codigoPeca2 = scanner.nextInt();
		
		System.out.print("Informe a quantidade de peça 2: ");
		quantidadePeca2 = scanner.nextInt();
		
		System.out.print("Informe o valor unitário da peça 2: ");
		valorUnitarioPeca2 = scanner.nextDouble();
		
		valorTotalFinal = (valorUnitarioPeca1 * quantidadePeca1) + (valorUnitarioPeca2 * quantidadePeca2);
		
		System.out.println("");
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotalFinal);
		
		scanner.close();
	}

}
