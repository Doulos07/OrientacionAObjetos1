package CuentaConGanchos.ejercicio9;

public class CuentaCorriente extends Cuenta{
	private double descubierto;

	CuentaCorriente(){
		super();
		setDescubierto(0);
	}
	
	CuentaCorriente(double monto, double descubierto){
        this.depositar(monto);
        this.descubierto = -descubierto;
    }
	
	public double getDescubierto() {
		return descubierto;
	}
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	public boolean puedeExtraer (double monto) {
		return (this.getSaldo() - monto) >= this.getDescubierto();
	}
	
}
