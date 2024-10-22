package CuentaConGanchos.ejercicio9;

public abstract class Cuenta {
	private double saldo;
	
	Cuenta (){
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar (double saldo) {
		this.saldo += saldo;
	}
	
	public boolean extraer (double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta (double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	protected void extraerSinControlar (double monto) {
		this.saldo -= monto;
	}
	
	abstract boolean puedeExtraer (double monto);
}
