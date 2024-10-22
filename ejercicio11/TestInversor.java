package ElInversor.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInversor {
	
	private Inversor inversor;
	private InversionEnAcciones inversion1;
	private PlazoFijo inversion2;
	
	@BeforeEach
	public void setUp() {
		LocalDate fecha = LocalDate.of(2024, 10, 20); //modificar en cada Test
		this.inversor = new Inversor("Ana Frank");
		this.inversion1 = new InversionEnAcciones("InversorX", 1000, 2.5);
		this.inversion2 = new PlazoFijo(fecha, 2500, 0.02);
	}
	
	@Test
	public void testAgregarInversion () {
		this.inversor.addInversion(inversion1);
		this.inversor.addInversion(inversion2);
		assertEquals(2, this.inversor.getInversiones().size());
	}
	
	@Test
	public void TestInversionTotal () {
		this.inversor.addInversion(inversion1);
		assertEquals(2500, this.inversor.inversionTotal());
	}
}
