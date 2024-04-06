package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese un numero entero entre el 1 y el 9: ");
		int num = scanner.nextInt();
		
		if (num >= 1 && num <=9) {
			System.out.println("La Tabla de multiplicar de: " + num + ":");
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " +(num * i));
			} 
			
			}else {
				System.out.println("El numero ingresado es incorrecto");
		}
		scanner.close();
	}

}
