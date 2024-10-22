package CuentaConGanchos.ejercicio9;

public class CajaDeAhorro extends Cuenta {
	
	CajaDeAhorro(){
		super();
	}
	
	CajaDeAhorro(double saldo){
		this.depositar(saldo);
	}
	
	public double montoTotal (double monto) {
		return monto+(monto*0.02);
	}
	
	public void depositar (double monto) {
		super.depositar(monto*0.98);
	}
	
	public boolean extraer(double monto) {
		return super.extraer(montoTotal(monto));
	}
	
	public boolean transferirACuenta (double monto, Cuenta cuentaDestino) {
		return super.transferirACuenta(monto*0.98, cuentaDestino);
	}
	
	public boolean puedeExtraer (double monto) {
		return (getSaldo() >= this.montoTotal(monto));
	}
}
