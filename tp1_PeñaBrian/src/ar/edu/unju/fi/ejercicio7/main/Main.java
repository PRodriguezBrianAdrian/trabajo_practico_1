package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7.model.Empleado;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el Nombre del Empleado: ");
		String nombre = scanner.nextLine();
		
		System.out.print("Ingrese el legajo del empleado: ");
		int legajo = scanner.nextInt();
		
		System.out.print("Ingrese el salario del empleado: ");
		double salario = scanner.nextDouble();
		
		Empleado empleado = new Empleado (nombre, legajo, salario);
		
		empleado.mostrarDatos();
		
		empleado.darAumento();
		
		empleado.mostrarDatos();
		
	
		scanner.close();

	}
}		
