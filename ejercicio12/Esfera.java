package VolumenYSuperficieDeSolidos.ejercicio12;

public class Esfera extends Pieza{
	
	private int radio;
	
	
	
	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}

	public int getRadio() {
		return this.radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	//Volumen de una esfera: ⁴⁄₃ * π * radio ³.
	//Superficie de una esfera: 4 * π * radio 2

	public double getVolumenDeMaterial() {
		return (4.0/3.0) * Math.PI * Math.pow(getRadio(), 3);
	}
	
	public double getSuperficieDeColor() {
		return 4 * Math.PI * Math.pow(getRadio(), 2);
	}
}
