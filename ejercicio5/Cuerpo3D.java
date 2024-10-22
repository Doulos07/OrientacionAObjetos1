package FigurasYCuerpos.ejercicio5;

public class Cuerpo3D{
	private double 	Altura;
	private Figura 	caraBasal;
	
	Cuerpo3D (){
		
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	public void setCaraBasal (Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public Object getCaraBasal() {
		return this.caraBasal;
	}
	
	public double getVolumen () {
		return this.caraBasal.getArea()*getAltura();
	}
	
	public double getSuperficieExterior () {
		return 2*this.caraBasal.getArea()+this.caraBasal.getPerimetro()*getAltura();
	}
}
