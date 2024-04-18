package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] numero  = new int[8];
		
		for(int i = 0; i < numero.length; i++){
			
			System.out.println("Ingrese el valor para la posicion " + (i+1) + ": ");
			numero[i] = scanner.nextInt();
		
		}
		
		
		
			for (int i = 0; i < numero.length; i++) {
				System.out.println("Indice: " + i + ", Valor: " + numero[i]);	
		}	
		scanner.close();
	}
}