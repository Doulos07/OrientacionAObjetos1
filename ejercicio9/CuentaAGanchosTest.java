package CuentaConGanchos.ejercicio9;

public class CuentaAGanchosTest {

	public static void main(String[] args) {
		System.out.println("--------------");
		CajaDeAhorro ahorro = new CajaDeAhorro(100);
		ahorro.depositar(1000);
		ahorro.extraer(500);
		System.out.println(ahorro.getSaldo());
		ahorro.depositar(500);
		System.out.println(ahorro.getSaldo());
		System.out.println("--------------");
		CuentaCorriente corriente = new CuentaCorriente(100, 50);
		corriente.depositar(100);
		System.out.println("superar los -50 de monto");
		System.out.println(corriente.extraer(251));
		System.out.println(corriente.extraer(250));
		corriente.depositar(1000);
		corriente.extraer(500);
		System.out.println(corriente.getSaldo());
		System.out.println("--------------");
	}

}
