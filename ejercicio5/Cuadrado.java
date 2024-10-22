package FigurasYCuerpos.ejercicio5;

public class Cuadrado implements Figura{
	private double lado;

	Cuadrado (){
		
	}
	
	Cuadrado(double lado) {
		setLado(lado);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getPerimetro () {
		return getLado()*4;
	}
	
	public double getArea () {
		return getLado()*getLado();
	}
}
