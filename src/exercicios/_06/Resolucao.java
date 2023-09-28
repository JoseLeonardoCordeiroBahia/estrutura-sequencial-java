package exercicios._06;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double valorA;
		double valorB;
		double valorC;
		
		double areaDoTrianguloRetangulo;
		double areaDoCirculo;
		double areaDoTrapezio;
		double areaDoQuadrado;
		double areaDoRetangulo;
		
		System.out.println("Calcular a área do triângulo retângulo, círculo, trapézio, "
				+ "quadrado e retângulo com base nos valores informados de A,B e C");
		
		System.out.println("");
		
		System.out.print("Informe o valor A: ");
		valorA = scanner.nextDouble();
		
		System.out.print("Informe o valor B: ");
		valorB = scanner.nextDouble();
		
		System.out.print("Informe o valor C: ");
		valorC = scanner.nextDouble();
		
		areaDoTrianguloRetangulo = (valorA * valorC) / 2;
		areaDoCirculo = 3.14159 * Math.pow(valorC, 2);
		areaDoTrapezio = ((valorA + valorB) * valorC) / 2;
		areaDoQuadrado = Math.pow(valorB, 2);
		areaDoRetangulo = valorA * valorB;
		
		System.out.println("");
		
		System.out.printf("TRIANGULO: %.3f\n", areaDoTrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f\n", areaDoCirculo);
		System.out.printf("TRAPEZIO: %.3f\n", areaDoTrapezio);
		System.out.printf("QUADRADO: %.3f\n", areaDoQuadrado);
		System.out.printf("RETANGULO: %.3f", areaDoRetangulo);
		
		scanner.close();
	}

}
