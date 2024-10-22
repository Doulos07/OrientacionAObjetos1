package FigurasYCuerpos.ejercicio5;

public class Circulo implements Figura{
	private double	radio;
	
	Circulo (){
		
	}

	public double getDiametro() {
		return getRadio()*2;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro () {
		return Math.PI*getDiametro();
	}
	
	public double getArea () {
		return Math.PI*(getRadio()*getRadio());
	}
}
