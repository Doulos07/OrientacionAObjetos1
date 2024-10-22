package Presupuesto.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item (String detalle, int cantidad, double costoUnitario) {
		setDetalle(detalle);
		setCantidad(cantidad);
		setCostoUnitario(costoUnitario);
	}
	
	public double costo () {
		return getCostoUnitario() * getCantidad();
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	
}
