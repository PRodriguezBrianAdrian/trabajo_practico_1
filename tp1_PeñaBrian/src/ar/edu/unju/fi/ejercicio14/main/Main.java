package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        
        
        int tamanio;
        do {
            System.out.print("Ingrese un número entero en el rango (comprendido entre 3 y 10): ");
            tamanio = scanner.nextInt();
        } while (tamanio < 3 || tamanio > 10);
        
      
        int[] lista = new int[tamanio];
        
       
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            lista[i] = scanner.nextInt();
        }
        
       
        System.out.println("Valores para la lista: ");
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Posición " + i + ": " + lista[i]);
        
        }
        
        int suma = 0;
        for (int num : lista) {
            suma += num;
        
        }   
       
        System.out.println("La suma de todos los valores en la lista es: " + suma);
        
       
        scanner.close();
   
	}	

}

