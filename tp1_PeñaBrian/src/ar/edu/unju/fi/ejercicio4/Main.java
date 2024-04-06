package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un numero del 0 al 10");
		int num = scanner.nextInt();

		if (num >= 0 && num <= 10) {
			int fact = 1;
			int i = 1;

			while (i <= num) {
				fact *= i;
				i++;
			}
			System.out.println("El factorial del numero " + num + " es " + fact);
		} else {
			System.out.println("El numero ingresado es invalido");
		}

		scanner.close();
	}

}
