package VolumenYSuperficieDeSolidos.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVolumenYSuperficie {
	
	private Cilindro cilindro;
	private Esfera esfera;
	private PrismaRectangular prisma;
	private ReporteDeConstruccion reporte;
	
	@BeforeEach
	public void setUp() {
		this.cilindro = new Cilindro("metal", "rojo", 10, 5);
		this.esfera = new Esfera("aluminio", "rojo", 10);
		this.prisma = new PrismaRectangular("metal", "azul", 10, 5, 5);
		this.reporte = new ReporteDeConstruccion();
	}
	
	@Test
	public void getVolumenDeMaterial() {
		assertEquals(1570.796, this.cilindro.getVolumenDeMaterial(),1e-3);
		assertEquals(4188.790, this.esfera.getVolumenDeMaterial(),1e-3);
		assertEquals(250, this.prisma.getVolumenDeMaterial(),1e-3);
	}
	
	@Test
	public void getSuperficieDeColor() {
		assertEquals(942.477, this.cilindro.getSuperficieDeColor(),1e-3);
		assertEquals(1256.637, this.esfera.getSuperficieDeColor(),1e-3);
		assertEquals(250, this.prisma.getSuperficieDeColor(),1e-3);
	}
	
	
	@Test
	public void TestReporteDeConstruccion() {
		reporte.addPieza(cilindro);
		reporte.addPieza(esfera);
		reporte.addPieza(prisma);
		assertEquals(3, this.reporte.getPiezas().size());
		assertEquals(1820.796, this.reporte.getVolumenDeMaterial("metal"),1e-3);
	}
	
	//Volumen de un cilindro: π * radio 2 * h.
	//Superficie de un cilindro: 2 * π * radio  * h + 2 * π * radio 2 
	
	
	//Volumen de una esfera: ⁴⁄₃ * π * radio ³.
	//Superficie de una esfera: 4 * π * radio 2
	
	//Volumen del prisma: ladoMayor * ladoMenor * altura
	//Superficie del prisma: 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura)
}
