package exercicios._04;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int horasTrabalhadas;
		double valorPorHora;
		double salario;
		
		System.out.println("Calcular sálario com base nas horas trabalhadas e o valor "
				+ "recebido por hora");
		
		System.out.println("");
		
		System.out.print("Informe seu número de registro: ");
		numero = scanner.nextInt();
		
		System.out.print("Informe suas horas trabalhadas: ");
		horasTrabalhadas = scanner.nextInt();
		
		System.out.print("Informe o valor que recebe por hora: ");
		valorPorHora = scanner.nextDouble();
		
		salario = horasTrabalhadas * valorPorHora;
		
		System.out.println("");
		
		System.out.println("NÚMERO = " + numero);
		System.out.printf("SALARIO = U$ %.2f", salario);
		
		scanner.close();
	}

}
