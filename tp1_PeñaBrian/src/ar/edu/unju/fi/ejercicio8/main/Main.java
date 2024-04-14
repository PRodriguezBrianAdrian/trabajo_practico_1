package ar.edu.unju.fi.ejercicio8.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese n: ");
		int n = scanner.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(n);
		calculadora.calcularSumatoria();
		System.out.println("La Sumatoria es: " + calculadora.calcularSumatoria());
		calculadora.calcularProductoria();
		System.out.println("La Productoria es: " + calculadora.calcularProductoria());
		
		scanner.close();
		
	}
	}
