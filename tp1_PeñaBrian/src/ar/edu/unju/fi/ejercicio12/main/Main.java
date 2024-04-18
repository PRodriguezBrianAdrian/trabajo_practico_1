package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;
import java.text.SimpleDateFormat;
public class Main {
	
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese su nombre: ");
	        String nombre = scanner.nextLine();

	        System.out.print("Ingrese su fecha de nacimiento (dia/ mes / año): ");
	        int diaNacimiento = scanner.nextInt();
	        int mesNacimiento = scanner.nextInt();
	        int anioNacimiento = scanner.nextInt();
			
	        Calendar fechaNacimiento = Calendar.getInstance();
	        fechaNacimiento.set(Calendar.DAY_OF_MONTH, diaNacimiento);
	        fechaNacimiento.set(Calendar.MONTH, mesNacimiento - 1);
	        fechaNacimiento.set(Calendar.YEAR, anioNacimiento);

	        Persona persona = new Persona(nombre, fechaNacimiento);

	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
	        System.out.println("Datos de la persona:");
	        System.out.println("Nombre: " + persona.getNombre());
	        System.out.println("Fecha de nacimiento: " + dateFormat.format(persona.getFechaNacimiento().getTime()));
	        System.out.println("Edad: " + persona.calcularEdad() + " años");
	        System.out.println("Signo del zodiaco: " + persona.calcularSignoZodiaco());
	        System.out.println("Estación del año: " + persona.calcularEstacion());
	        
	        
	        scanner.close();
	 }	
	 
	 
	 
}
