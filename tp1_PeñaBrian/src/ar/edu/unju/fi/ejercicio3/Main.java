package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese un numero entero: ");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El numero ingresado es par y el triple es: " + num * 3);
		}else {
			System.out.println("El numero ingresado es impar y el doble es: " + num * 2);
		}

		scanner.close();
		
	}

}
