package VolumenYSuperficieDeSolidos.ejercicio12;

public abstract class Pieza {
	protected String material;
	protected String color;
	
	
	
	public Pieza(String material, String color) {
		this.material = material;
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double getVolumenDeMaterial();
	
	public abstract double getSuperficieDeColor();
	
	
}
