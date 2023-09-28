package exercicios._02;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio;
		double area;
		
		System.out.println("Calcular raio de um círculo");
		
		System.out.println("");
		
		System.out.print("Informe o valor valor do raio de um círculo: ");
		raio = scanner.nextDouble();
		
//		area = pi * raio * raio;
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f", area);
		
		scanner.close();
	}

}
