package ElInversor.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPlazoFijo {

	private PlazoFijo inversor1;
	
	@BeforeEach
	private void setUp () {
		LocalDate fecha = LocalDate.of(2024, 10, 20); //modificar en cada Test
		inversor1 = new PlazoFijo(fecha, 2500, 0.02);
	}
	
	@Test //diferentes resultados si no se cambia la fecha de Constitucion
	public void TestValorActual () {
		assertEquals(2550, this.inversor1.valorActual()); 
	}
}
