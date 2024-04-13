package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	
	public static final double SALARIO_MINIMO = 210000.00;
	public static final double AUMENTO = 20000.00;
	
	public Empleado (String nombre, int legajo, double salario){
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario;
		
		if (salario >= SALARIO_MINIMO) {
			this.salario = salario;
		}else 
			this.salario = SALARIO_MINIMO;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static double getSalarioMinimo() {
		return SALARIO_MINIMO;
	}

	public static double getAumento() {
		return AUMENTO;
	}
	
	public void mostrarDatos(){
		System.out.println("Nombre del empleado: " + nombre);
		System.out.println("Legajo: " + legajo);
		System.out.println("Salario: $" + salario);
		
	}

		public void darAumento() {
		this.salario += AUMENTO;
	
		}
	
}
