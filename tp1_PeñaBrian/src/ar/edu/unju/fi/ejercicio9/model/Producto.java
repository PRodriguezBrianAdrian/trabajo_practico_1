package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private Long codigo;
	private double precio;
	private int descuento;
	
	public Producto(){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	public double CalcularDescuento(){
		double montoDescuento = 0;
		double auxiliar;
		double precioDescuento;
		if (descuento >= 0) {
			auxiliar = (double)descuento/100;
			montoDescuento = precio * auxiliar;
			precioDescuento = precio - montoDescuento;
		}
		precioDescuento = precio - montoDescuento;
		return precioDescuento;
	}

}

