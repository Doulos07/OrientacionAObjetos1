package VolumenYSuperficieDeSolidos.ejercicio12;

public class Cilindro extends Pieza{
	private int radio;
	private int altura;
	
	public Cilindro (String material, String color, int radio, int altura){
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}
	
	
	public int getRadio() {
		return this.radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	/*Volumen de un cilindro: π * radio 2 * h.
	Superficie de un cilindro: 2 * π * radio  * h + 2 * π * radio 2 
	 */
	
	public double getVolumenDeMaterial() {
		return Math.PI * Math.pow(getRadio(), 2) * getAltura();
	}
	
	public double getSuperficieDeColor() {
		return 2 * Math.PI * getRadio() * getAltura() + 2 * Math.PI * Math.pow(getRadio(), 2);
	}
}
