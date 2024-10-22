package BalanzaMejorada.ejercicio4;

public class Producto {
	
	private double peso;
	private double PrecioPorKilo;
	private String descripcion;
	
	
	public Producto () {
		
	}
	
	
	public Producto(double peso, double precioPorKilo, String descripcion) {
		setPeso(peso);
		setPrecioPorKilo(precioPorKilo);;
		setDescripcion(descripcion);
	}

	
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getPrecioPorKilo() {
		return PrecioPorKilo;
	}

	
	public void setPrecioPorKilo(double precioPorKilo) {
		PrecioPorKilo = precioPorKilo;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public double precio () {
		return getPeso()*getPrecioPorKilo();
	}
}
