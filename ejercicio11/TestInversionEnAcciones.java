package ElInversor.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInversionEnAcciones {
	
	private InversionEnAcciones inversion1;
	
	@BeforeEach
	public void setUp() {
		this.inversion1 = new InversionEnAcciones("InversorX", 1000, 2.5);
	}
	
	@Test
	public void testValorActual () {
		assertEquals(2500, this.inversion1.valorActual());
	}
	
}
