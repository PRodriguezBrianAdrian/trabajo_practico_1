package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tamanio;
		
		do{
			System.out.print("Ingrese un número entero en el rango (comprendido entre 5 y 10): ");
            tamanio = scanner.nextInt();
        } while (tamanio < 5 || tamanio > 10);
		
		
		String[] nombres = new String[tamanio];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Ingrese el nombre de la persona " + (i+1) + ": ");
			nombres[i] = scanner.next();
		}
		System.out.println("Contenido de la lista:");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Indice " + i + ": " + nombres[i]);
	}
		
		System.out.println("Contenido de la lista invertida: ");
		for(int i =nombres.length -1; i>=0; i--){
			System.out.println("Indice " + i + ": " + nombres[i]);
		}
		scanner.close();
	}
	
}
