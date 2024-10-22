package VolumenYSuperficieDeSolidos.ejercicio12;

public class PrismaRectangular extends Pieza {
	
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	
	
	public PrismaRectangular(String material, String color, int ladoMayor, int ladoMenor, int altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}

	public int getLadoMayor() {
		return this.ladoMayor;
	}

	public void setLadoMayor(int ladoMayor) {
		this.ladoMayor = ladoMayor;
	}

	public int getLadoMenor() {
		return this.ladoMenor;
	}

	public void setLadoMenor(int ladoMenor) {
		this.ladoMenor = ladoMenor;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	//Volumen del prisma: ladoMayor * ladoMenor * altura
	//Superficie del prisma: 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura)

	public double getVolumenDeMaterial() {
		return getLadoMayor() * getLadoMenor() * getAltura();
	}
	
	public double getSuperficieDeColor() {
		return 2 * (getLadoMayor() * getLadoMenor() + getLadoMayor() * getAltura() + getLadoMenor() * getAltura());
	}
}
