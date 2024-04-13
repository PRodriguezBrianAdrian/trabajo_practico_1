package ar.edu.unju.fi.ejercicio6.Main;

import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6.Model.Persona;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        Persona persona1 = new Persona();
        persona1.mostrarDatos();

        
        
        System.out.print("Ingrese DNI: ");
        int dni2 = scanner.nextInt();
        System.out.print("Ingrese nombre: ");
        scanner.nextLine();
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese fecha de nacimiento (yyyy-MM-dd): ");
        LocalDate fechaNacimiento2 = LocalDate.parse(scanner.nextLine());
        System.out.print("Ingrese provincia: ");
        String provincia2 = scanner.nextLine();
        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);
        persona2.mostrarDatos();

        
        
        System.out.print("Ingrese DNI: ");
        int dni3 = scanner.nextInt();
        System.out.print("Ingrese nombre: ");
        scanner.nextLine(); 
        String nombre3 = scanner.nextLine();
        System.out.print("Ingrese fecha de nacimiento (yyyy-MM-dd): ");
        LocalDate fechaNacimiento3 = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);
        persona3.mostrarDatos();
        
        scanner.close();
    }
}