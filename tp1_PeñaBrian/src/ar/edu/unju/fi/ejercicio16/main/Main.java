package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] nombres = new String [5];
		
		System.out.println("Ingrese 5 nombres: ");
		for (int i = 0; i <nombres.length; i++) {
		System.out.print("Nombre " + (i+1) + ": ");
		nombres[i] = scanner.nextLine();
		
		}
		
		System.out.println("Valores guardado en la lista: ");
		int lista = 0;
		while (lista < nombres.length) {
		System.out.println(nombres[lista]);
		lista++;
		}
		 System.out.println("Tamaño de la lista: " + nombres.length);
	        
	        
	        byte indice;
	        do {
	            System.out.print("Ingrese el índice del elemento a eliminar (0 - " + (nombres.length - 1) + "): ");
	            indice = scanner.nextByte();
	        } while (indice < 0 || indice >= nombres.length);
	        
	        
	        for (int i = (int)indice; i < nombres.length - 1; i++) {
	            nombres[i] = nombres[i + 1];
	        }
	        nombres[nombres.length - 1] = "";  
	       
	        System.out.println("lista después de eliminar el elemento:");
	        for (String nombre : nombres) {
	            System.out.println(nombre);
	        }
	        
	        scanner.close();
	}
}
