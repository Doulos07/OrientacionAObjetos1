package BalanzaElectronica.ejercicio2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	public Balanza(int cantidadDeProductos, double precioTotal, double pesoTotal) {
		setCantidadDeProductos(cantidadDeProductos);
		setPrecioTotal(precioTotal);
		setPesoTotal(pesoTotal);
	}

	
	public Balanza() {

	}


	public void ponerEnCero () {
		setCantidadDeProductos(0);
		setPesoTotal(0);
		setPrecioTotal(0);
	}
	
	
	public void agregarProducto (Producto prod) {
		setCantidadDeProductos(getCantidadDeProductos()+1);
		setPesoTotal(getPesoTotal()+prod.getPeso());
		setPrecioTotal(getPrecioTotal()+prod.precio());
	}

	
	public Ticket emitirTicket (){
		Ticket ticket = new Ticket (getCantidadDeProductos(), getPrecioTotal(), getPesoTotal());
		ponerEnCero();
		return ticket;
	}
	
	
	
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}


	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}


	public double getPesoTotal() {
		return pesoTotal;
	}
	

}
