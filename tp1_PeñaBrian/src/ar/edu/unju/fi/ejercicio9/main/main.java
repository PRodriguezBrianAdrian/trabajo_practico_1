package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class main {

	public static void Main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int contador = 1;
		
		while(contador <=3) {
			System.out.println("Ingrese el nombre del producto " + contador + " : ");
			String nombre = scanner.nextLine();
			System.out.println("Ingrese el codigo del producto " + contador + " : ");
			Long codigo = scanner.nextLong();
			System.out.println("Ingrese el precio del producto " + contador + " : ");
			double precio = scanner.nextDouble();
			System.out.println("Ingrese el descuento del producto " + contador + " : ");
			int descuento = scanner.nextInt();
			
			//para limpiar
			scanner.nextLine();
			
			Producto producto = new Producto();
			
			producto.setNombre(nombre);
			producto.setCodigo(codigo);
			producto.setPrecio(precio);
			producto.setDescuento(descuento);
			
			producto.CalcularDescuento();
			
			System.out.println("Producto" + contador + ": ");
			System.out.println("Nombre del producto: " + nombre);
			System.out.println("Codigo del producto: " + codigo);
			System.out.println("Precio del producto: " + precio);
			System.out.println("Descuento del producto: " + descuento + "%");
			System.out.println("Precio del producto con el descuento ya realizado: " + producto.CalcularDescuento());
			
			contador++;
		}
		scanner.close();
	}

}
